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


    @ManyToMany(cascade = CascadeType.ALL)
    private List<ShoppingCart> userCartList;

    @ManyToMany(fetch = FetchType.EAGER/*cascade = CascadeType.ALL*/)
    private List<ProductOrder> productOrderList;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<AppRole> roles;

    public void addShoppingCart(ShoppingCart s){this.userCartList.add(s);}
    public void addProductOrder(ProductOrder po){this.productOrderList.add(po);}
    public void addRole(AppRole role){
        this.roles.add(role);
    }

    public AppUser() {
        this.roles = new HashSet<>();
        this.userCartList=new ArrayList<>();
        this.productOrderList = new ArrayList<>();
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

    public List<ProductOrder> getProductOrderList() {
        return productOrderList;
    }

    public void setProductOrderList(List<ProductOrder> productOrderList) {
        this.productOrderList = productOrderList;
    }

    public List<ShoppingCart> getUserCartList() {
        return userCartList;
    }

    public void setUserCartList(List<ShoppingCart> userCartList) {
        this.userCartList = userCartList;
    }

}
