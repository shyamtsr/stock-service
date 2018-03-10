package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.QuoteStock;
import com.example.demo.service.StockService;

@RestController
@RequestMapping("/rest/stock")
public class StockResourceController {

	@Autowired
	private StockService stockService;
	@GetMapping("/home")
	public String home() {
		return "Hello Shyam, Welcome to Spring Boot";
	}

	@GetMapping("/{userName}")
	public List<QuoteStock> getStock(@PathVariable("userName") final String userName) {
		return stockService.getStockInfo(userName);
	}

}
