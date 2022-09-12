package com.fxTrading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.fxTrading")
public class FxTradingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FxTradingApplication.class, args);
	}

}
