package com.zensar.product.management.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.product.management.beans.Product;

@RestController
public class WelcomeController {

	@RequestMapping("/")
	public String welcome() {
		return "<h1>Welcome<h1>";
	}

	@RequestMapping(value = "/getAllProducts", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Product getAllProducts() {
		System.out.println("\nInside GetAllProducts");
		Product product = new Product(101, "Sanitizer", 500);
		System.out.println(product.toString());
		return product;
	}

}
