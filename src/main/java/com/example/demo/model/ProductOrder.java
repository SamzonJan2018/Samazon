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

    @ManyToMany
    public List<ShoppingCart> cartList;

    public ProductOrder(List<ShoppingCart> cartList, List<AppUser> userList) {
        this.cartList = cartList;
        this.userList = userList;
    }

    public List<ShoppingCart> getCartList() {
        return cartList;
    }

    public void setCartList(List<ShoppingCart> cartList) {
        this.cartList = cartList;
    }

    public void addCart(ShoppingCart shoppingCart){this.cartList.add(shoppingCart);}

    public ProductOrder() {
    }

    @ManyToMany(mappedBy = "userOrderList")
    public List<AppUser> userList;

    public List<AppUser> getUserList() {
        return userList;
    }

    public void setUserList(List<AppUser> userList) {
        this.userList = userList;
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
