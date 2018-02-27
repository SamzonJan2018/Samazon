package com.example.demo.repository;

import com.example.demo.model.AppUser;
import com.example.demo.model.Product;
import com.example.demo.model.ShoppingCart;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart,Long> {
    ShoppingCart findById(Long id);
    ShoppingCart findByAppUserContaining(AppUser username);

}
