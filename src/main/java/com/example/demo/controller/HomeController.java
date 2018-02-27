package com.example.demo.controller;

import com.example.demo.model.AppUser;
import com.example.demo.model.Product;
import com.example.demo.model.ProductOrder;
import com.example.demo.model.ShoppingCart;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    AppRoleRepository appRoleRepository;

    @Autowired
    AppUserRepository appUserRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    public int counter=0;


    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/")
    public String showIndex(Model model){

        return "index";
    }

    @RequestMapping("/productlist")
    public String productList(Model model){
        model.addAttribute("product",productRepository.findAll());
        return "productlist";
    }

    @RequestMapping("/appuserform")
    public String userRegistration(Model model){
        return "appuserform";
    }


    @GetMapping("/productform")
    public String addProduct(Model model){
        model.addAttribute("product",new Product());
        return "productform";
    }
    @PostMapping("/productform")
    public String addProductForm(@Valid @ModelAttribute("product") Product product, BindingResult result,
                                    RedirectAttributes redirectAttributes){
        if(result.hasErrors()){
            return "productform";
        }
        else{
            productRepository.save(product);
            return "redirect:/";
        }
    }
    @RequestMapping("/detail/{id}")
    public String productDetail(@PathVariable("id") long id,Model model,RedirectAttributes redirectAttributes ){
        model.addAttribute("product", productRepository.findOne(id));
        return "productdetail";
    }

    @RequestMapping("/addshoppingcart/{id}")
    public String addToShoppingCart(@PathVariable("id") long id,Model model,RedirectAttributes redirectAttributes ){
        Product product=productRepository.findOne(id);
        counter++;
        model.addAttribute("product", productRepository.findOne(id));
        productRepository.save(product);
        return "shoppingcart";
    }

    @RequestMapping("/orderconfirmation")
    public String orderConfirmation(Model model,Authentication authentication ){
        //model.addAttribute("totalOrder", productOrderRepository.countByOrderNum());
        //model.addAttribute("totalOrder",counter);

       AppUser appUser= appUserRepository.findAppUserByUsername(authentication.getName());
      //  Long countByProductListIn(List<Product> productList);
        ShoppingCart shoppingCart =shoppingCartRepository.findByAppUserContaining(appUser);
       List<Product> productList= shoppingCart.getProductList();

        model.addAttribute("totalOrder",shoppingCartRepository.countByProductListIn(productList));
        return "orderconfirmation";
    }

    //For user registration
    @RequestMapping(value="/appuserform",method= RequestMethod.GET)
    public String showRegistrationPage(Model model){
        model.addAttribute("appuser",new AppUser());
        return "appuserform";
    }

    @RequestMapping("/delete/{id}")
    public String deleteShoppingCartItem(@PathVariable("id") long id){


        //shoppingCartRepository.delete(id);
        return "redirect:/";
    }

    //Order history
    @RequestMapping(value="/orderhistory",method= RequestMethod.GET)
    public String showOrderHistory(Authentication authentication,Model model){
        AppUser appUser=appUserRepository.findAppUserByUsername(authentication.getName());
        model.addAttribute("appuser",appUser);
        model.addAttribute("productorder",appUserRepository.findByUsername(authentication.getName()));
        return "appuserform";
    }

    @RequestMapping(value="/appuserform",method= RequestMethod.POST)
    public String processRegistrationPage(@Valid @ModelAttribute("appuser") AppUser appuser, BindingResult result, Model model){
        model.addAttribute("appuser",appuser);
        if(result.hasErrors()){
            return "appuserform";
        }else{
            appUserRepository.save(appuser);
            model.addAttribute("message","User Account Successfully Created");
            ShoppingCart shoppingCart = new ShoppingCart();
            shoppingCartRepository.save(shoppingCart);
            appuser.addShoppingCart(shoppingCart);
            appUserRepository.save(appuser);
        }
        return "redirect:/";
    }

    @PostMapping("/search")
    public String search(HttpServletRequest request, Model model){

        String searchString = request.getParameter("search");

      Iterable<Product> products = productRepository.findAllByProductName(searchString);
      model.addAttribute("product",products);


        return "productlist";
    }

    @GetMapping("/detail/{id}")
    public String productDetail(@PathVariable("id") Long id, Model model){

        Product product = productRepository.findOne(id);

        model.addAttribute("product",product);

        return "productdetail";

    }

    @GetMapping("/addshoppingcart/{id}")
    public String addShoppingCart(@PathVariable("id") Long id, Model model, Authentication authentication){
     AppUser appUser = appUserRepository.findAppUserByUsername(authentication.getName());
     ShoppingCart shoppingCart = shoppingCartRepository.findByAppUserContaining(appUser);


        Product product = productRepository.findOne(id);
        shoppingCart.addProduct(product);
        shoppingCartRepository.save(shoppingCart);

       return "redirect:/";


    }

@GetMapping("/shoppingcart")
    public String showShoppingCart(Model model, Authentication authentication){
        AppUser appUser = appUserRepository.findAppUserByUsername(authentication.getName());
        ShoppingCart shoppingCart = shoppingCartRepository.findByAppUserContaining(appUser);
        model.addAttribute("shopping", shoppingCart);
        return "shoppingcart";

    }


}
