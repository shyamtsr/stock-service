package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.QuoteNamesVo;
import com.example.demo.dto.QuoteStock;

@Service
// @Configuration
public class StockService {

	@Autowired
	public RestTemplate restTemplate;

	public List<QuoteStock> getStockInfo(String userName) {

		ResponseEntity<List<String>> quotesResponse = restTemplate.exchange("http://localhost:8686/rest/db/" + userName,
				HttpMethod.GET, null, new ParameterizedTypeReference<List<String>>() {
				});

		List<String> quotes = quotesResponse.getBody();
		return getStockPrice(quotes);

	}

	private List<QuoteStock> getStockPrice(List<String> quote) {

		QuoteNamesVo namesVo = new QuoteNamesVo(quote);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		headers.setContentType(MediaType.APPLICATION_JSON);

		// Data attached to the request.
		HttpEntity<QuoteNamesVo> requestBody = new HttpEntity<>(namesVo, headers);
		ResponseEntity<QuoteStock[]> response = restTemplate.exchange("http://localhost:8696/rest/db-pricing/quoteinfo",
				HttpMethod.POST, requestBody, QuoteStock[].class);
		QuoteStock[] body = response.getBody();

		List<QuoteStock> list = Arrays.asList(body);
		return list;
	}

}
