package com.tricon.order.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.tricon.order.pojo.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, Integer>,OrderRepositoryCustom{
	
		
}
