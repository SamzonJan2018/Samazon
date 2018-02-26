package com.example.demo.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @NotEmpty
    //@Column(unique = true)
    private String username;

    @NotEmpty
    private String password;

    private String userEmail;

    private String fullName;

    @ManyToMany
    private List<ProductOrder> userOrderList;

    public List<ProductOrder> getUserOrderList() {
        return userOrderList;
    }

    public void setUserOrderList(List<ProductOrder> userOrderList) {
        this.userOrderList = userOrderList;
    }

    public void addOrderHistory(ProductOrder productOrder){this.userOrderList.add(productOrder);}

    @ManyToMany(fetch = FetchType.EAGER)
    private List<ShoppingCart> userCartList;

    public List<ShoppingCart> getUserCartList() {
        return userCartList;
    }

    public void setUserCartList(List<ShoppingCart> userCartList) {
        this.userCartList = userCartList;
    }

    public void addShoppingCart(ShoppingCart s){
        this.userCartList.add(s);
    }

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<AppRole> roles;

    public AppUser() {
        this.roles = new HashSet<>();
        this.userCartList=new ArrayList<>();
        this.userOrderList=new ArrayList<>();
    }

    public void addRole(AppRole role){
        this.roles.add(role);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Set<AppRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<AppRole> roles) {
        this.roles = roles;
    }
}
