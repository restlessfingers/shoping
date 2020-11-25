package com.example.shopExample.boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.shopExample.boot.model.OrderDetail;

public interface OrderDetailRepository extends CrudRepository<OrderDetail, Long> {

}