package com.git.course.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)	
	private Long id;
	private String name;
	private int quantity;
	private BigDecimal price;
	
	public Product() { }

	public Product(String name, int quantity, BigDecimal price) {
		this.setName(name);
		this.setQuantity(quantity);
		this.setPrice(price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}