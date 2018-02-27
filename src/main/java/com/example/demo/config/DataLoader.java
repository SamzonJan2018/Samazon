package com.example.demo.config;



import com.example.demo.model.*;
import com.example.demo.repository.*;
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

    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    @Autowired
    ProductOrderRepository productOrderRepository;

    @Override
    public void run(String... strings) throws Exception {

        AppRole role = new AppRole();
        role.setRoleName("USER");
        appRoleRepository.save(role);

        role = new AppRole();
        role.setRoleName("ADMIN");
        appRoleRepository.save(role);

        // A few users
        // User 1
        AppUser user = new AppUser();
        user.setUsername("John");
        user.setPassword("password1");
        user.setFullName("John Doe");
        user.setUserEmail("g1@gmail.com");
        appUserRepository.save(user);
        user.addRole(appRoleRepository.findAppRoleByRoleName("USER"));
        appUserRepository.save(user);
        // User 2
        user = new AppUser();
        user.setUsername("Jacob");
        user.setPassword("password2");
        user.setFullName("Jacob Smith");
        user.setUserEmail("g2@gmail.com");
        appUserRepository.save(user);
        user.addRole(appRoleRepository.findAppRoleByRoleName("USER"));
        appUserRepository.save(user);
        // User 3
        user = new AppUser();
        user.setUsername("Joe");
        user.setPassword("password3");
        user.setFullName("Joe Blow");
        user.setUserEmail("g3@gmail.com");
        appUserRepository.save(user);
        user.addRole(appRoleRepository.findAppRoleByRoleName("USER"));
        appUserRepository.save(user);


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

        //Shopping Cart
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.addProduct(productRepo.findById(new Long(3)));
        shoppingCart.addProduct(productRepo.findById(new Long(5)));
        shoppingCart.addProduct(productRepo.findById(new Long(9)));
        shoppingCart.addProduct(productRepo.findById(new Long(13)));
        shoppingCart.addProduct(productRepo.findById(new Long(1)));
        shoppingCartRepository.save(shoppingCart);

        shoppingCart=new ShoppingCart();
        shoppingCart.addProduct(productRepo.findById(new Long(1)));
        shoppingCart.addProduct(productRepo.findById(new Long(4)));
        shoppingCart.addProduct(productRepo.findById(new Long(10)));
        shoppingCart.addProduct(productRepo.findById(new Long(6)));
        shoppingCart.addProduct(productRepo.findById(new Long(15)));
        shoppingCartRepository.save(shoppingCart);
        shoppingCart=new ShoppingCart();
        shoppingCart.addProduct(productRepo.findById(new Long(7)));
        shoppingCart.addProduct(productRepo.findById(new Long(12)));
        shoppingCart.addProduct(productRepo.findById(new Long(9)));
        shoppingCart.addProduct(productRepo.findById(new Long(2)));
        shoppingCart.addProduct(productRepo.findById(new Long(8)));
        shoppingCartRepository.save(shoppingCart);

        // Adding shopping carts to Users
        AppUser appUser=appUserRepository.findOne(new Long(1));
        appUser.addShoppingCart(shoppingCartRepository.findById(new Long(2)));
        //appUser.addProductOrder(productOrderRepository.findOne(new Long(1)));
        appUserRepository.save(appUser);
        appUser=appUserRepository.findOne(new Long(3));
        appUser.addShoppingCart(shoppingCartRepository.findById(new Long(1)));
        appUser.addShoppingCart(shoppingCartRepository.findById(new Long(3)));
        appUserRepository.save(appUser);
        ProductOrder productOrder = new ProductOrder();
        productOrder.addShoppingCarts(shoppingCartRepository.findById(new Long(1)));
        productOrder.addShoppingCarts(shoppingCartRepository.findById(new Long(3)));
        productOrderRepository.save(productOrder);
        appUser.addProductOrder(productOrderRepository.findById(new Long (1)));
        //appUser.addProductOrder(productOrderRepository.findOne(new Long(2)));
        appUserRepository.save(appUser);








    }
}
