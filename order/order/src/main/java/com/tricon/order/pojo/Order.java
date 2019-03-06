package com.tricon.order.pojo;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection="order")
public class Order {
	
	@Id
	@NotNull
	private int id;
	@NotNull
	private double total;
	@NotNull
	private String currency;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy HH:mm")
	@NotNull
    private Date orderTime;
	@NotNull
    private int customerId;
	@NotNull
    private String paymentMode;
	@NotNull
    private List<OrderedProduct> orderedItems;
   
    public Order() {
		super();
	}
	public Order(int id, double total, String currency, Date orderTime, int customerId, String paymentMode,
			List<OrderedProduct> orderedItems) {
		super();
		this.id = id;
		this.total = total;
		this.currency = currency;
		this.orderTime = orderTime;
		this.customerId = customerId;
		this.paymentMode = paymentMode;
		this.orderedItems = orderedItems;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", total=" + total + ", currency=" + currency + ", orderTime=" + orderTime
				+ ", customerId=" + customerId + ", paymentMode=" + paymentMode + ", orderedItems=" + orderedItems
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public List<OrderedProduct> getOrderedItems() {
		return orderedItems;
	}
	public void setOrderedItems(List<OrderedProduct> orderedItems) {
		this.orderedItems = orderedItems;
	}
	
    
	
	

}
