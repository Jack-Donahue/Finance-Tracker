package com.example.money_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.moneymanager", "com.example.security"})
public class MoneyManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneyManagerApplication.class, args);
	}

}
