package com.example.shopExample.boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.shopExample.boot.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}