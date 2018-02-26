package com.example.demo.model;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String productName;

    private String productPicture;

    private Double productPrice;

    private String productDescription;
   // private int productQuantity;

  @ManyToMany
    private List<ProductOrder> productOrders;




    @ManyToMany(mappedBy = "productList")
    private List<ShoppingCart> shoppingCartList;


    public Product(){
        shoppingCartList = new ArrayList<>();
        this.productOrders = new ArrayList<>();
    }

    public List<ShoppingCart> getShoppingCartList() {
        return shoppingCartList;
    }

    public void setShoppingCartList(List<ShoppingCart> shoppingCartList) {
        this.shoppingCartList = shoppingCartList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPicture() {
        return productPicture;
    }

    public void setProductPicture(String productPicture) {
        this.productPicture = productPicture;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }


}
