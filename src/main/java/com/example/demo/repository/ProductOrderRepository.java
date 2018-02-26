package com.example.demo.repository;

import com.example.demo.model.ProductOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductOrderRepository extends CrudRepository<ProductOrder, Long> {

}
