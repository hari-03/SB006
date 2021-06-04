package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Sb0061Application {

	public static void main(String[] args) {
		SpringApplication.run(Sb0061Application.class, args);
	}
	@GetMapping
	public String sayHello()
	{
		return "Hello Jenkins........";
	}
}
