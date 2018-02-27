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


    public void addProduct(Product p){
        this.productList.add(p);
    }



    public ShoppingCart(){
       productList = new ArrayList<>();
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

    @ManyToMany(mappedBy = "cartList")
    private List<ProductOrder> orderList;


    public ShoppingCart(List<AppUser> appUser, List<Product> productList, List<ProductOrder> orderList) {
        this.appUser = appUser;
        this.productList = productList;
        this.orderList = orderList;
    }

    public List<ProductOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<ProductOrder> orderList) {
        this.orderList = orderList;
    }
}
