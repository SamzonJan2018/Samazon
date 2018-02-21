package com.example.demo.config;

import com.example.demo.model.AppRole;
import com.example.demo.model.Product;
import com.example.demo.repository.AppRoleRepository;
import com.example.demo.repository.AppUserRepository;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader  implements CommandLineRunner{

    @Autowired
    AppRoleRepository appRoleRepository;

    @Autowired
    AppUserRepository appUserRepository;

    @Autowired
    ProductRepository productRepo;

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
        productRepo.save(newProduct);
        //2
        newProduct = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(300.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        productRepo.save(newProduct);
        //3
        newProduct = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(400.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        productRepo.save(newProduct);
        //4
        newProduct = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(500.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        productRepo.save(newProduct);
        //5
        newProduct = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(600.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        productRepo.save(newProduct);
        //6
        newProduct = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(700.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        productRepo.save(newProduct);
        //7
        newProduct = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(800.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        productRepo.save(newProduct);
        //8
        newProduct = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(900.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        productRepo.save(newProduct);
        //9
        newProduct = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(200.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        productRepo.save(newProduct);
        //10
        newProduct = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(100.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        productRepo.save(newProduct);
        //11
        newProduct = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(600.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        productRepo.save(newProduct);
        //12
        newProduct = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(200.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        productRepo.save(newProduct);
        //13
        newProduct = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(900.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        productRepo.save(newProduct);
        //14
        newProduct = new Product();
        newProduct.setProductName("Apple");
        newProduct.setProductDescription("Apple product description");
        newProduct.setProductPrice(300.50);
        newProduct.setProductPicture("https://cdn.shopify.com/s/files/1/0237/6317/products/iphone7.88-2_0d46c04e-6e4f-452d-a50f-c3807cb9c977_1024x1024.jpg?v=1513379425");
        productRepo.save(newProduct);
        //15
        newProduct=new Product();
        newProduct.setProductName("Dracula");
        newProduct.setProductDescription("It's a book.");
        newProduct.setProductPrice(20.99);
        newProduct.setProductPicture("http://www.therookies.co/wp-content/uploads/2017/04/101532-book-cover-for-bram-stokers-dracula-69-1493451161.jpg");
        productRepo.save(newProduct);









    }
}
