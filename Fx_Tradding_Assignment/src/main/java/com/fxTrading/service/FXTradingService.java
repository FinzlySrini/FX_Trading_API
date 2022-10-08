package com.fxTrading.service;

import java.util.List;
import com.fxTrading.entity.Book;
import com.fxTrading.entity.Print;
import com.fxTrading.repository.RepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FXTradingService {
	
	final double rate = 66.00;
	
	@Autowired
	private RepoInterface print;
	@Autowired
	private RepoInterface repo;
	

	public String bookTrade(Book bookingDetails, String bookingConfirm) {
		
		double inrConverted = bookingDetails.getTransferAmount() * rate;
		if (bookingDetails.getGetRate().equalsIgnoreCase("Yes")) {
			if (bookingConfirm.equalsIgnoreCase("Book")) {
				print.save(new Print(0, bookingDetails.getCurrencyPair(), bookingDetails.getCustomerName(),
						inrConverted, rate));

				return "You are transferring INR " + inrConverted + " to " + bookingDetails.getCustomerName() + "."
						+ "(Assuming that rate was " + rate + ")." + "Trade for USDINR has been booked with rate "
						+ rate + "," + "The amount of RS " + inrConverted + " will be transferred in 2 working days to "
						+ bookingDetails.getCustomerName() + "...";
			} else {

				return "Trade is Cancelled!";
			}
		} else {
			if (bookingConfirm.equalsIgnoreCase("Book")) {

				print.save(new Print(0, bookingDetails.getCurrencyPair(), bookingDetails.getCustomerName(),
						inrConverted, rate));

				return "Trade for USDINR has been booked with rate " + rate + "," + "The amount of RS " + inrConverted
						+ " will be transferred in 2 working days to " + bookingDetails.getCustomerName() + "...";
			} else {
				return "Trade is Cancelled!";
			}
		}
	}
	
	
	public double  convertedValue(Book bookingDetails) {
		
		double total=rate*bookingDetails.getTransferAmount();
		//System.out.println(total);
		return total;
	}
	
	
	
	// PRINT TRADE
	
	public void addBooking(int tradeNo, String currencyPair, String customerName, double amount, double rate) {
		repo.save((new Print(tradeNo, currencyPair, customerName, amount, rate)));
	}

	public List<Print> printTrade() {
		return repo.findAll();
	}

}
