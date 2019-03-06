package com.tricon.order.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.order.pojo.Order;
import com.tricon.order.service.OrderService;

@RestController
@RequestMapping("tricon/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
@GetMapping("/")
public ResponseEntity<List<Order>> getAll() {
	List<Order> list = orderService.getAll();
	return new ResponseEntity<List<Order>>(list, HttpStatus.OK);
}
@GetMapping("/{id}")
public Optional<Order> getById(@PathVariable("id") int id) {
	return orderService.getByid(id);
}

@PostMapping("/")
public Order save(@RequestBody Order order) {
	return orderService.save(order);
}
@PutMapping("/")
public ResponseEntity<Order> updateArticle(@RequestBody Order order) {
	orderService.update(order);
	return new ResponseEntity<Order>(order, HttpStatus.OK);
}

@DeleteMapping("/{id}")
public  void delete(@PathVariable("id") int id) {
	orderService.delete(id);
}

@GetMapping ("/myorder/{id}")
public List<Order> getOrderDetails(@PathVariable int id,@RequestParam(value = "fromDate", required = false) String fromDate,@RequestParam(value = "toDate", required = false) String toDate) throws ParseException{
    return orderService.getMyorders(id,new SimpleDateFormat("dd/MM/yyyy").parse(fromDate)  ,new SimpleDateFormat("dd/MM/yyyy").parse(toDate));
}
}
