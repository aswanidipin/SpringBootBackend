package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Trade;
import com.example.demo.repository.TradeRepository;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class TradeController {
	
	
	@Autowired
	private TradeRepository tradeRepository;
	
	
	@GetMapping("/trades")
	public List<Trade> getTrades()
	{
	return this.tradeRepository.findAll();	
	}

	@PostMapping("/trades")
	public Trade createTrade( @RequestBody Trade trade) {
	 return tradeRepository.save(trade);
	}
}
