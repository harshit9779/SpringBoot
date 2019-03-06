package com.tricon.product.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tricon.product.pojo.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
