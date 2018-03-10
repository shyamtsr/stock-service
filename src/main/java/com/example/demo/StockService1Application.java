package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
// @ComponentScan({ "com.example.controller", "com.example.service" })

public class StockService1Application {

	public static void main(String[] args) {
		SpringApplication.run(StockService1Application.class, args);
	}
}
