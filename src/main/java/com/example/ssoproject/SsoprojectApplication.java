package com.example.ssoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.ssoproject")
public class SsoprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsoprojectApplication.class, args);
	}

}
