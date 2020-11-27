package com.example.shopExample.boot.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.shopExample.boot.model.ProductCart;
import com.example.shopExample.boot.utils.controller.StatusSession;

@Controller
@RequestMapping(value = "/pay")
public class PayController {

	@RequestMapping(value ="/show")
	public String show (HttpSession session) {

		if (session.getAttribute("cart") == null) {

			// System.out.println("Cart null");

		} else {

			List<ProductCart> cart = (List<ProductCart>) session.getAttribute("cart");
			session.setAttribute("cart", cart);
			session.setAttribute("status", StatusSession.TOPAY);
		}

	

		return "shoping/pay";
	}
	
	
	@RequestMapping(value ="/payWithCard")
	public String payWithCard (HttpSession session) {

		
			session.setAttribute("status", StatusSession.FINISHED);
		

	

		return "shoping/finished";
	}

}