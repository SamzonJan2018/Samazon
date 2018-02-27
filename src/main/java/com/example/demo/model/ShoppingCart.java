package com.example.demo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ShoppingCart {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToMany(mappedBy = "userCartList")
    private List <AppUser> appUser;

    @ManyToMany
    private List<Product> productList;

    public ShoppingCart(){
        this.appUser = new ArrayList<>();
        this.productList = new ArrayList<>();
    }

    private double shoppingCartTotal;
    private boolean withinShoppingCart;
    //private String orderDate;

   /* @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderNum;*/


    public void addProduct(Product p){
        this.productList.add(p);
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<AppUser> getAppUser() {
        return appUser;
    }

    public void setAppUser(List<AppUser> appUser) {
        this.appUser = appUser;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getShoppingCartTotal() {
        return shoppingCartTotal;
    }

    public void setShoppingCartTotal(double shoppingCartTotal) {
        this.shoppingCartTotal = shoppingCartTotal;
    }

    public boolean isWithinShoppingCart() {
        return withinShoppingCart;
    }

    public void setWithinShoppingCart(boolean withinShoppingCart) {
        this.withinShoppingCart = withinShoppingCart;
    }
/*

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
*/

/*    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }*/
}
