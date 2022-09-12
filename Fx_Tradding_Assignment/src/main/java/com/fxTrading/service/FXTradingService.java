package com.fxTrading.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fxTrading.dao.BookDao;
import com.fxTrading.dao.PrintDao;
import com.fxTrading.entity.Book;
import com.fxTrading.entity.Print;

@Service
public class FXTradingService {
	@Autowired
	BookDao bookdao;
	@Autowired
	PrintDao printdao;

	public String bookTrade(Book bookingDetails, String bookingConfirm) {
		return bookdao.bookTrade(bookingDetails, bookingConfirm);
	}


	public ArrayList<Print> printTrade() {
		return printdao.printTrade();
	}
	
}
