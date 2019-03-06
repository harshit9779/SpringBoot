package com.tricon.customer.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@NotNull
	private int Id;
	@NotNull 
	
	@Size(min=2,max=50)
	private String name;
	@NotNull
	@Pattern(regexp="\\d{10}")
	private String phoneNo;
	@NotNull
	@Email
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
