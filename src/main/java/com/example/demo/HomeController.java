package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @RequestMapping("/")
    public String showIndex(Model model){
        return "index";
    }

    @RequestMapping("/productlist")
    public String productList(Model model){
        model.addAttribute("product",productRepository.findall());
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
    public String processRegistrationPage(@Valid @ModelAttribute("User") AppUser appuser, BindingResult result, Model model){
        model.addAttribute("appuser",appuser);
        if(result.hasErrors()){
            return "appuserform";
        }else{
            appUserRepository.saveUser(appuser);
            model.addAttribute("message","User Account Successfully Created");
        }
        return "redirect:/";
    }
}
