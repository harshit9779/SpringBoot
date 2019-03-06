package com.tricon.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tricon.customer.dao.CustomerRepository;
import com.tricon.customer.pojo.Customer;

@Service
@Transactional(readOnly = true)
public class CustomerService {
	
	 @Autowired
	 CustomerRepository customerRepository;
	 
	

	public  List<Customer> getAll() {
		
		return (List<Customer>) customerRepository.findAll();
	}
	
	@Transactional
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
		
	}
	
	@Transactional
	public  Customer update(Customer customer) {
		return customerRepository.save(customer);
		
	}
	
	@Transactional
	public void delete(int id) {
		customerRepository.deleteById(id);
		
	}

	public Optional<Customer> getByid(int id) {
		return customerRepository.findById(id);
	}

	
}
