package com.fxTrading.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fxTrading.entity.Book;
import com.fxTrading.entity.Print;
import com.fxTrading.service.FXTradingService;

@RestController
public class FXTradingController {
	@Autowired
	FXTradingService fxTradingService;

	@PostMapping("booktrade/{book}")
	public String BookTrades(@RequestBody Book bookingDetails, @PathVariable("book") String bookingConfirm) {
		try {
		System.out.println(bookingDetails.getCustomerName());
		}catch(Exception e) {
			System.out.println("error");
		}
		return fxTradingService.bookTrade(bookingDetails, bookingConfirm);
	}

	@GetMapping("PrintTrade")
	public ArrayList<Print> printTrade() {
		return fxTradingService.printTrade();
	}
}
