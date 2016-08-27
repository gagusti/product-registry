package com.git.course.repository;

import org.springframework.data.repository.CrudRepository;

import com.git.course.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}