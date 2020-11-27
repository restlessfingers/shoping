package com.example.shopExample.boot.controller;

import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.shopExample.boot.model.Product;
import com.example.shopExample.boot.service.CustomerService;
import com.example.shopExample.boot.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService service;

	@RequestMapping("/show")
	public String showProducts (Model model) {

		model.addAttribute("items", service.findAll());
		return "shoping/items.html";
	}

	@RequestMapping("/addItem")
	public String addProduct (Model model) {

		return "shoping/addItem.html";
	}

	@RequestMapping("/insertItem")
	public String insertProduct (Product product, Model model) {

		service.insertProduct (product);

		model.addAttribute("items", service.findAll());
		return "shoping/items.html";
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detailShow(@RequestParam("itemId") Long id, HttpSession session,  Model model) {
	
		model.addAttribute("item", service.findById(id));
		
		
		return "shoping/detail.html";
	}
	
	
	

}
