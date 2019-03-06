package com.tricon.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tricon.product.dao.ProductRepository;
import com.tricon.product.pojo.Product;

@Service
@Transactional(readOnly = true)
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAll() {
		return productRepository.findAll();
	}

	public Optional<Product> getByid(String id) {
		return productRepository.findById(id);
	}
	
	@Transactional
	public Product save(Product product) {
		return productRepository.save(product);
	}
	
	@Transactional
	public void update(Product product) {
		 productRepository.save(product);
		
	}
	
	@Transactional
	public void delete(String id) {
		productRepository.deleteById(id);
		
	}

}
