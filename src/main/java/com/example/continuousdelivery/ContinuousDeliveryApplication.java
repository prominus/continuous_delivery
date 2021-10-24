package com.example.continuousdelivery;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class ContinuousDeliveryApplication {

	@RequestMapping("/")
	String home() {
		return "Continuous Delivery";
	}

	public static void main(String[] args) {
		SpringApplication.run(ContinuousDeliveryApplication.class, args);
	}

}
