package com.tricon.myOrders.pojo;



public class Price {
	
	private double amount;
	private String currency;
	Tax tax;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Tax getTax() {
		return tax;
	}
	public void setTax(Tax tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Price [amount=" + amount + ", currency=" + currency + ", tax=" + tax + "]";
	}
	public Price(double amount, String currency, Tax tax) {
		super();
		this.amount = amount;
		this.currency = currency;
		this.tax = tax;
	}
	public Price() {
		super();
	}
	
}
