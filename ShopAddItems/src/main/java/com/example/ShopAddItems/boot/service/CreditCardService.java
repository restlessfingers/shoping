package com.example.ShopAddItems.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ShopAddItems.boot.model.CreditCard;
import com.example.ShopAddItems.boot.repository.CreditCardRepository;


@Service
public class CreditCardService {

	@Autowired
	CreditCardRepository repository;


	public Iterable<CreditCard> findAll() {

		return repository.findAll();
	}

	public void insertCreditCard (CreditCard creditcard) {

		repository.save(creditcard);
	}

}