package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Trade;
import com.example.demo.repository.TradeRepository;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Autowired
	private TradeRepository tradeRepository;
	
	@Override
	public void run(String... args) throws Exception {
	this.tradeRepository.save(new Trade(1, "CP-1", "B1", "20/05/2020", " ", 'N'));	
	this.tradeRepository.save(new Trade(2, "CP-2", "B2", "20/05/2020", " ", 'N'));	
	this.tradeRepository.save(new Trade(1, "CP-1", "B1", "20/05/2020", " ", 'Y'));	
		
	}

}
