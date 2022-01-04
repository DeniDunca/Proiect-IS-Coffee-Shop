package com.proiect.Coffee_Shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CoffeeShopApplication {

	public static void main(String[] args) {

		SpringApplication.run(CoffeeShopApplication.class, args);

	}
	@GetMapping("/hello")
	public String sayHello() {
		return String.format("Hello my friends");
	}

}
