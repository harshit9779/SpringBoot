package com.tricon.myOrders.pojo;

import java.util.List;

public class MyOrders {
	
	private Customer customer;
	private List<Orders> orders;
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "MyOrders [customer=" + customer + ", orders=" + orders + "]";
	}
	public MyOrders(Customer customer, List<Orders> orders) {
		super();
		this.customer = customer;
		this.orders = orders;
	}
	public MyOrders() {
		super();
	}
	
}
