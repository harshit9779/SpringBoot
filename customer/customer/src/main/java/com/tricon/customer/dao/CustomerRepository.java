package com.tricon.customer.dao;

import org.springframework.data.repository.CrudRepository;

import com.tricon.customer.pojo.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
	

}
