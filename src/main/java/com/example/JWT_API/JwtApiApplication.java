package com.example.JWT_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.JWT_API"})
public class JwtApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtApiApplication.class, args);
	}

}
