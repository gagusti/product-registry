package com.git.course;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.git.course.model.Product;
import com.git.course.repository.ProductRepository;

@SpringBootApplication
public class ProductregistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductregistryApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(ProductRepository repository) {
		return (args) -> {
			repository.save(new Product("Samsung EVO 32GB", 5, new BigDecimal("10.70")));
			repository.save(new Product("Panasonic Lumix DMC-FZ28", 10, new BigDecimal("190.70")));
			repository.save(new Product("J1 Case, LK Ultra [Slim Thin]", 20, new BigDecimal("7.70")));
			repository.save(new Product("Kamo 5PCS 0.4mm Drill Bits", 7, new BigDecimal("7.99")));
			repository.save(new Product("2pcs nRF24L01+ 2.4GHz Wireless", 20, new BigDecimal("5.95")));
		};
	}	
}
