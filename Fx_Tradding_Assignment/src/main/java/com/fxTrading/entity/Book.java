package com.fxTrading.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Book {

	@NotEmpty
	@Pattern(regexp = "[A-Za-z\\s.]*", message = "Invalid customer name!")
	private String customerName;

	@NotEmpty
	@Pattern(regexp = "^(USDINR)$", message = "Invalid Currency Pair!")
	private String currencyPair;

	@NotNull
	@Min(value = 1, message = "Enter the valid amount!")
	private float transferAmount;

	@NotEmpty
	@Pattern(regexp = "^(yes||YES||Yes||no||NO)*", message = "Only yes or no is accepted")
	private String getRate;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCurrencyPair() {
		return currencyPair;
	}

	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}

	public float getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(float transferAmount) {
		this.transferAmount = transferAmount;
	}

	public String getGetRate() {
		return getRate;
	}

	public void setGetRate(String getRate) {
		this.getRate = getRate;
	}

	@Override
	public String toString() {
		return "Book [customerName=" + customerName + ", currencyPair=" + currencyPair + ", transferAmount="
				+ transferAmount + ", getRate=" + getRate + "]";
	}

}
