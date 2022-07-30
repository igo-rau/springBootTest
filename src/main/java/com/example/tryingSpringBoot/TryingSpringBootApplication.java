package com.example.tryingSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TryingSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TryingSpringBootApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/")
	public String index(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("You are on the main page %s!", name);
	}
}
