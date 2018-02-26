package com.example.demo.controller;

import com.example.demo.model.AppUser;
import com.example.demo.model.Product;
import com.example.demo.model.ShoppingCart;
import com.example.demo.repository.AppRoleRepository;
import com.example.demo.repository.AppUserRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.ShoppingCartRepository;
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

    @RequestMapping("/addshoppingcart/{id}")
    public String addToShoppingCart(@PathVariable("id") long id,Model model,RedirectAttributes redirectAttributes ){
        Product product=productRepository.findOne(id);
        model.addAttribute("product", productRepository.findOne(id));
        productRepository.save(product);
        return "redirect:/shoppingcart";
    }
    //For user registration
    @RequestMapping(value="/appuserform",method= RequestMethod.GET)
    public String showRegistrationPage(Model model){
        model.addAttribute("appuser",new AppUser());
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


//need to modify this later
       return "redirect:/";


    }


}
