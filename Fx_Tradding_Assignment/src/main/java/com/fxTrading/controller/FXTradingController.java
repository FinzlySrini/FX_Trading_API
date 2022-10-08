package com.fxTrading.controller;

import java.util.List;
import javax.validation.Valid;
import com.fxTrading.entity.Book;
import com.fxTrading.entity.Print;
import com.fxTrading.service.FXTradingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FXTradingController {
	@Autowired
	FXTradingService fxTradingService;
	

	@PostMapping("booktrade/{book}")
	public String BookTrades(@RequestBody @Valid Book bookingDetails, @PathVariable("book") String bookingConfirm) {
		return fxTradingService.bookTrade(bookingDetails, bookingConfirm);
	}

	@GetMapping("PrintTrade")
	public List<Print> printTrade() {
		return fxTradingService.printTrade();
	}
	

	
	@GetMapping("getTransferedAmount")
	public double convertedValue(Book bookingDetails) {
		
		return fxTradingService.convertedValue(bookingDetails); 
		
	}
}
