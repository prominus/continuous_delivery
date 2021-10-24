package com.example.continuousdelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContinuousDeliveryApplication {

	@RequestMapping("/")
	String home() {
		return "Continuous Delivery";
	}

	public static void main(String[] args) {
		SpringApplication.run(ContinuousDeliveryApplication.class, args);
	}

}
