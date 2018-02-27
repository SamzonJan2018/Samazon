package com.example.demo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ShoppingCart {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ShoppingCart() {
    }

    // Coonection to Product
    @ManyToMany
    private List<Product> productList;

    public ShoppingCart(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product p){
        this.productList.add(p);
    }

    // Connection to Product Order
    @ManyToMany(mappedBy = "shoppingCartOrderList")
    private List<ProductOrder> productOrderCartList;

    public List<ProductOrder> getProductOrderCartList() {
        return productOrderCartList;
    }

    public void setProductOrderCartList(List<ProductOrder> productOrderCartList) {
        this.productOrderCartList = productOrderCartList;
    }

    // Connection to Shopper
    @ManyToMany(mappedBy = "siteShoppingCartList")
    private List<SiteShopper> siteShopperCartList;

    public List<SiteShopper> getSiteShopperCartList() {
        return siteShopperCartList;
    }

    public void setSiteShopperCartList(List<SiteShopper> siteShopperCartList) {
        this.siteShopperCartList = siteShopperCartList;
    }
}
