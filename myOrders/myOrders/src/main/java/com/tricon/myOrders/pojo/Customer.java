package com.tricon.myOrders.pojo;



public class Customer {
	
	
	private int Id;
	private String name;
	private String phoneNo;
	private String email;
	
	public Customer(int id, String name, String phoneNo, String email) {
		super();
		Id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	
	
	
	public Customer() {
		super();
	}



	public int getId() {
		return Id;
	}
	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", name=" + name + ", phoneNo=" + phoneNo + ", email=" + email + "]";
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
