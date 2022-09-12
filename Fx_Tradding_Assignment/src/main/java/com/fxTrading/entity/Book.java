package com.fxTrading.entity;

public class Book {
	private String customerName;
	private String currencyPair;
	private float transferAmount;
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
