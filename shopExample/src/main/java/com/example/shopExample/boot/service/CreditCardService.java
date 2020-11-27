package com.example.shopExample.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopExample.boot.model.CreditCard;
import com.example.shopExample.boot.model.Product;
import com.example.shopExample.boot.repository.CreditCardRepository;


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
	public CreditCard findById(long id) {

		return repository.findById(id);
	}

}