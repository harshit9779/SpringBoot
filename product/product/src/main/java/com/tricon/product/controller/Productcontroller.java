package com.tricon.product.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.tricon.product.pojo.Product;
import com.tricon.product.service.ProductService;

@RestController
@RequestMapping("tricon/product")
public class Productcontroller {
	
	@Autowired
	private ProductService productService;
	
@GetMapping("/")
public ResponseEntity<List<Product>> getAll() {
	List<Product> list = productService.getAll();
	return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
}
@GetMapping("/{id}")
public Optional<Product> getById(@PathVariable("id") String id) {
	return productService.getByid(id);
}

@PostMapping("/")
public Product save(@RequestBody Product Product) {
	return productService.save(Product);
}
@PutMapping("/")
public ResponseEntity<Product> updateArticle(@RequestBody Product Product) {
	productService.update(Product);
	return new ResponseEntity<Product>(Product, HttpStatus.OK);
}

@DeleteMapping("/{id}")
public  void delete(@PathVariable("id") String id) {
	productService.delete(id);
}
}
