package com.db.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


// This file is the entry point for the application which start from here

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.db.*")
@EnableWebMvc class DemoSpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringProjectApplication.class, args);
		System.out.print("first application");
	}

}
