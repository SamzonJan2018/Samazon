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

    @ManyToMany(cascade = CascadeType.ALL)
    public List<ShoppingCart> cartList;

    @ManyToMany(mappedBy = "productOrderList")
    public List<AppUser> appUsers;

    public ProductOrder() {
        cartList = new ArrayList<>();
    }

    public List<AppUser> getAppUsers() {
        return appUsers;
    }

    public void setAppUsers(List<AppUser> appUsers) {
        this.appUsers = appUsers;
    }

    public ProductOrder(List<ShoppingCart> cartList) {
        this.cartList = cartList;
    }

    public void addShoppingCarts(ShoppingCart s){
        this.cartList.add(s);
    }

    public List<ShoppingCart> getCartList() {
        return cartList;
    }

    public void setCartList(List<ShoppingCart> cartList) {
        this.cartList = cartList;
    }

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
