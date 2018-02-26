package com.example.demo.controller;

import com.example.demo.model.AppUser;
import com.example.demo.model.Product;
import com.example.demo.model.ShoppingCart;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    ProductOrderRepository productOrderRepository;

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
    public String orderConfirmation(Model model ){
        //model.addAttribute("totalOrder", productOrderRepository.countByOrderNum());
        model.addAttribute("totalOrder",counter);
        return "orderconfirmation";
    }
    //For user registration
    @RequestMapping(value="/appuserform",method= RequestMethod.GET)
    public String showRegistrationPage(Model model){
        model.addAttribute("appuser",new AppUser());
        return "appuserform";
    }


    @RequestMapping(value="/appuserform",method= RequestMethod.POST)
    public String processRegistrationPage(@Valid @ModelAttribute("User") AppUser appuser, BindingResult result, Model model){
        model.addAttribute("appuser",appuser);
        if(result.hasErrors()){
            return "appuserform";
        }else{
            appUserRepository.save(appuser);
            model.addAttribute("message","User Account Successfully Created");
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
}
