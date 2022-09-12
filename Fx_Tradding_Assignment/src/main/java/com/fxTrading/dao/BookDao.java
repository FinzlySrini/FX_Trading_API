package com.fxTrading.dao;

import org.springframework.stereotype.Repository;

import com.fxTrading.entity.Book;

@Repository
public class BookDao {
	static int count = 0;

	public String bookTrade(Book bookingDetails, String bookingConfirm) {

		if (bookingDetails.getCustomerName().matches("^[A-Z a-z]*$")) {
			switch (bookingDetails.getCurrencyPair()) {
				case ("USDINR"):
					final double rate = 66.00;
					double inrConverted = bookingDetails.getTransferAmount() * rate;
					if (bookingDetails.getGetRate().equalsIgnoreCase("Yes")) {
						if (bookingConfirm.equalsIgnoreCase("Book")) {
							count++;
							PrintDao.addBooking(count, bookingDetails.getCurrencyPair(),bookingDetails.getCustomerName(), inrConverted, rate);
							
							return "You are transferring INR " + inrConverted + " to " + bookingDetails.getCustomerName() + "." + "(Assuming that rate was " + rate + ")." + "Trade for USDINR has been booked with rate " + rate + "," + "The amount of RS "+ inrConverted + " will be transferred in 2 working days to "+ bookingDetails.getCustomerName() + "...";
						} 
						else if (bookingConfirm.equalsIgnoreCase("Cancel")) {
							
							return "Trade is Cancelled!";
						}
						else
						{
							return "Invalid Option...\nTrade is Cancelled!";
						}
					}
					else if (bookingDetails.getGetRate().equalsIgnoreCase("no")) {
						if (bookingConfirm.equalsIgnoreCase("Book")) {
							count++;
							PrintDao.addBooking(count, bookingDetails.getCurrencyPair(),bookingDetails.getCustomerName(), inrConverted, rate);
							
							return "Trade for USDINR has been booked with rate " + rate + "," + "The amount of RS "+ inrConverted + " will be transferred in 2 working days to "+ bookingDetails.getCustomerName() + ".";
						} 
						else if (bookingConfirm.equalsIgnoreCase("Cancel")) {
							return "Trade is Cancelled!";
						} 
						else {
							return "Invalid Option...\nTrade is Cancelled...";
						}
					} 
					else {
						return "Invalid option...\nPlease Re-Enter the GetRate...";
					}
				default:
					return "Invalid Curency Pair...\nCurrency Pair doesn't exists";
			}
		} else {
			return "Invalid Customer Name...\nPlease Re-Enter valid Name";
		}
	}
}
