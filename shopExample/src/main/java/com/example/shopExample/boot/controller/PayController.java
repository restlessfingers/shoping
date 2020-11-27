package com.example.shopExample.boot.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.shopExample.boot.model.CreditCard;
import com.example.shopExample.boot.model.ProductCart;
import com.example.shopExample.boot.service.CreditCardService;
import com.example.shopExample.boot.service.ProductService;
import com.example.shopExample.boot.view.StatusSession;

@Controller
@RequestMapping(value = "pay")

public class PayController {

	@Autowired
	CreditCardService service;
	
	@RequestMapping(value = "show", method = RequestMethod.GET)
	public String show (HttpSession session) {

		if (session.getAttribute("cart") == null) {

			// System.out.println("Cart null");
			return "shoping/home";

		} else {

			List<ProductCart> cart = (List<ProductCart>) session.getAttribute("cart");
			session.setAttribute("cart", cart);
		}

		String sid = session.getId();
		session.setAttribute("sid", sid);
		System.out.println("Session id: " + sid);

		return "/shoping/pay";
	}
	
	
	
	@RequestMapping(value = "payWithCard", method = RequestMethod.GET)
	public String add(@RequestParam("id") Long id, HttpSession session) {

		
				List<CreditCard> creditCard = (List<CreditCard>) session.getAttribute("creditCard");
				int index = this.exists(id, creditCard);

				
	
			creditCard.add(new CreditCard(service.findById(id), 1));
			session.setAttribute("cart", creditCard);
			session.setAttribute("status", StatusSession.PAY.getOptionText());



		String sid = session.getId();
		session.setAttribute("sid", sid);
		System.out.println("Session id: " + sid);

		return "redirect:/cart/show";
	}
	
	private int exists(Long id, List<CreditCard> creditCart) {

		for (int i = 0; i < creditCart.size(); i++) {

			if (creditCart.get(i).getId() == id) {
				return i;
			}

		}
		return -1;
	}

}