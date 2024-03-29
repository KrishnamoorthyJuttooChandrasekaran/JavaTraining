package com.ust;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class ElasticBeanApplication {
	
	@GetMapping("/status")
	public String depoly() {
		return "Deployed successfully!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(ElasticBeanApplication.class, args);
	}

}
