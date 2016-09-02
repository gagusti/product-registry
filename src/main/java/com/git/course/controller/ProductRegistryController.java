package com.git.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.git.course.model.Product;
import com.git.course.repository.ProductRepository;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import java.math.BigDecimal;

@RestController
public class ProductRegistryController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping("/products")
	public List<Product> getProducts() {
		List<Product> products = (List<Product>) productRepository.findAll();
		return products;
	}
	
	@RequestMapping(value = "/products/addNew", method = RequestMethod.POST)
	public void addNewProduct(@RequestPart("name") String name,
							  @RequestParam("quantity") int quantity,
							  @RequestParam("price")BigDecimal price) {

		productRepository.save(new Product(name, quantity, price));
	}
	

}