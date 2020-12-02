package com.example.ShopAddItems.boot.repository;


import org.springframework.data.repository.CrudRepository;
import com.example.ShopAddItems.boot.model.CreditCard;


public interface CreditCardRepository extends CrudRepository<CreditCard, Long> {

	CreditCard findById(long id);
}