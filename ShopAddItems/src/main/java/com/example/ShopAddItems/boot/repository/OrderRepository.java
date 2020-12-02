package com.example.ShopAddItems.boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.ShopAddItems.boot.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}