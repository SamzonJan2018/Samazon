package com.example.demo.config;

import com.example.demo.model.AppRole;
import com.example.demo.model.Product;
import com.example.demo.repository.AppRoleRepository;
import com.example.demo.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader  implements CommandLineRunner{

    @Autowired
    AppRoleRepository appRoleRepository;

    @Autowired
    AppUserRepository appUserRepository;

    @Override
    public void run(String... strings) throws Exception {

        AppRole role = new AppRole();
        role.setRoleName("USER");
        appRoleRepository.save(role);

        role = new AppRole();
        role.setRoleName("ADMIN");
        appRoleRepository.save(role);

        //Load 15 initial prodcuts here

        Product newProduct = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(200.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        Product newProduct2 = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(300.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        Product newProduct3 = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(400.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        Product newProduct4 = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(500.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        Product newProduct5 = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(600.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        Product newProduct6 = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(700.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        Product newProduct7 = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(800.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        Product newProduct8 = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(900.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        Product newProduct9 = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(200.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");


        Product newProduct10 = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(100.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        Product newProduct11 = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(600.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        Product newProduct12 = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(200.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        Product newProduct13 = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(900.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        Product newProduct14 = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(300.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");









    }
}
