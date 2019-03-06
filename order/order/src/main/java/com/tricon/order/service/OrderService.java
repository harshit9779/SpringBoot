package com.tricon.order.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tricon.order.dao.OrderRepository;
import com.tricon.order.dao.OrderRepositoryCustom;
import com.tricon.order.pojo.Order;

@Service
@Transactional(readOnly = true)
public class OrderService implements OrderRepositoryCustom {

	@Autowired
	OrderRepository orderRepository;
	
	public List<Order> getAll() {
		return orderRepository.findAll();
	}

	public Optional<Order> getByid(int id) {
		return orderRepository.findById(id);
	}
	
	@Transactional
	public Order save(Order order) {
		return orderRepository.insert(order);
	}
	
	@Transactional
	public void update(Order order) {
		orderRepository.save(order);
		
	}
	
	@Transactional
	public void delete(int id) {
	orderRepository.deleteById(id);
		
	}
	

	@Override
	public List<Order> getMyorders(int id, Date fromDate, Date toDate) {
		return orderRepository.getMyorders(id, fromDate, toDate);
	}


}
