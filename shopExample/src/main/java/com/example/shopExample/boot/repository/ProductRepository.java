package com.example.shopExample.boot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.example.shopExample.boot.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

	
	List<Product> findByName(String name);

	Product findById(long id);
}