package com.tricon.myOrders.pojo;

import java.util.Date;


import com.fasterxml.jackson.annotation.JsonFormat;


public class OrderedProduct {
	
	private Product product;
    public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	private double amount;
    private String currency;
    private Tax tax;
    private double totalAmount;
    
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
    private Date scheduledDelivery;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
    private Date arrivedDelivery;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
    private Date scheduledShipping;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
    private Date arrivedShipping;
	public OrderedProduct() {
		super();
	}
	
	public OrderedProduct(  Product product,double amount, String currency, Tax tax, double totalAmount,
			Date scheduledDelivery, Date arrivedDelivery, Date scheduledShipping, Date arrivedShipping) {
		super();
		this.product = product;
		this.amount = amount;
		this.currency = currency;
		this.tax = tax;
		this.totalAmount = totalAmount;
		this.scheduledDelivery = scheduledDelivery;
		this.arrivedDelivery = arrivedDelivery;
		this.scheduledShipping = scheduledShipping;
		this.arrivedShipping = arrivedShipping;
	}

	public Date getScheduledDelivery() {
		return scheduledDelivery;
	}

	public void setScheduledDelivery(Date scheduledDelivery) {
		this.scheduledDelivery = scheduledDelivery;
	}

	public Date getArrivedDelivery() {
		return arrivedDelivery;
	}

	public void setArrivedDelivery(Date arrivedDelivery) {
		this.arrivedDelivery = arrivedDelivery;
	}

	public Date getScheduledShipping() {
		return scheduledShipping;
	}

	public void setScheduledShipping(Date scheduledShipping) {
		this.scheduledShipping = scheduledShipping;
	}

	public Date getArrivedShipping() {
		return arrivedShipping;
	}

	public void setArrivedShipping(Date arrivedShipping) {
		this.arrivedShipping = arrivedShipping;
	}


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
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
}
