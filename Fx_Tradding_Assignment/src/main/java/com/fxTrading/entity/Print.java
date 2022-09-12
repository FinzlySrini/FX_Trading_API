package com.fxTrading.entity;

public class Print {
	private int tradeNo;
	private String currencyPair;
	private String customerName;
	private double amount;
	private double rate;
	
	public Print(int tradeNo, String currencyPair, String customerName, double amount, double rate) {
		super();
		this.tradeNo = tradeNo;
		this.currencyPair = currencyPair;
		this.customerName = customerName;
		this.amount = amount;
		this.rate = rate;
	}

	public int getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(int tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getCurrencyPair() {
		return currencyPair;
	}

	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Print [tradeNo=" + tradeNo + ", currencyPair=" + currencyPair + ", customerName=" + customerName
				+ ", amount=" + amount + ", rate=" + rate + "]";
	}
	
}
	

	