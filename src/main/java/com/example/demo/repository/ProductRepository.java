package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long>{
    Product findById(Long id);
    //TODO:add search method here

      Iterable<Product> findAllByProductName(String searchTerm);
}
