package com.example.demo.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class ProductOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Date orderDate;

    private int orderNum;

    private double amount;

    private String userEmail;

    private String fullName;

    public ProductOrder() {
    }

    // Connection to Shopping Cart
    @ManyToMany
    private List<ShoppingCart> shoppingCartOrderList;

    public void addCart(ShoppingCart shoppingCart){
        this.shoppingCartOrderList.add(shoppingCart);
    }

    public ProductOrder(List<ShoppingCart> shoppingCartOrderList) {
        this.shoppingCartOrderList = shoppingCartOrderList;
    }

    public List<ShoppingCart> getShoppingCartOrderList() {
        return shoppingCartOrderList;
    }

    public void setShoppingCartOrderList(List<ShoppingCart> shoppingCartOrderList) {
        this.shoppingCartOrderList = shoppingCartOrderList;
    }

    // Connection to Site Shopper
    @ManyToMany(mappedBy = "siteProductOrderList")
    private List<SiteShopper> siteShopperOrderList;

    public List<SiteShopper> getSiteShopperOrderList() {
        return siteShopperOrderList;
    }

    public void setSiteShopperOrderList(List<SiteShopper> siteShopperOrderList) {
        this.siteShopperOrderList = siteShopperOrderList;
    }

    // Getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
