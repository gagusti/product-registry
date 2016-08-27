package com.git.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.git.course.model.Product;
import com.git.course.repository.ProductRepository;

@RestController
public class ProductRegistryController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping("/products")
	public List<Product> getProducts() {
		List<Product> products = (List<Product>) productRepository.findAll();
		return products;
	}

}