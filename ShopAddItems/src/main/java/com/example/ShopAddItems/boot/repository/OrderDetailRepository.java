package com.example.ShopAddItems.boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.ShopAddItems.boot.model.OrderDetail;

public interface OrderDetailRepository extends CrudRepository<OrderDetail, Long> {

}