package com.example.demo.repository;

import com.example.demo.model.AppUser;
import com.example.demo.model.ShoppingCart;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart,Long> {
    ShoppingCart findById(Long id);
    ShoppingCart findByAppUserContaining(AppUser username);
}
