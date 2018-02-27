package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class SiteShopper {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SiteShopper() {
    }

    public SiteShopper(List<ProductOrder> siteProductOrderList, List<ShoppingCart> siteShoppingCartList, List<AppUser> siteAppUserList) {
        this.siteProductOrderList = siteProductOrderList;
        this.siteShoppingCartList = siteShoppingCartList;
        this.siteAppUserList = siteAppUserList;
    }

    // Connection to Product Order
    @ManyToMany
    private List<ProductOrder> siteProductOrderList;

    public void addProductOrder(ProductOrder productOrder){
        this.siteProductOrderList.add(productOrder);
    }

    public List<ProductOrder> getSiteProductOrderList() {
        return siteProductOrderList;
    }

    public void setSiteProductOrderList(List<ProductOrder> siteProductOrderList) {
        this.siteProductOrderList = siteProductOrderList;
    }

    // Connection to Shopping cart
    @ManyToMany
    private List<ShoppingCart> siteShoppingCartList;

    public void addShoppingCart(ShoppingCart shoppingCart){
        this.siteShoppingCartList.add(shoppingCart);
    }

    public List<ShoppingCart> getSiteShoppingCartList() {
        return siteShoppingCartList;
    }

    public void setSiteShoppingCartList(List<ShoppingCart> siteShoppingCartList) {
        this.siteShoppingCartList = siteShoppingCartList;
    }

    // Connection to AppUser
    @ManyToMany
    private List<AppUser> siteAppUserList;

    public void addAppUser(AppUser appUser){
        this.siteAppUserList.add(appUser);
    }

    public List<AppUser> getSiteAppUserList() {
        return siteAppUserList;
    }

    public void setSiteAppUserList(List<AppUser> siteAppUserList) {
        this.siteAppUserList = siteAppUserList;
    }
}
