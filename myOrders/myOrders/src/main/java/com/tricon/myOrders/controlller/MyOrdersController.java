package com.tricon.myOrders.controlller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.myOrders.pojo.MyOrders;
import com.tricon.myOrders.restClientService.RestClientService;

@RestController
@RequestMapping("tricon/myorders")
public class MyOrdersController {

	@Autowired
    RestClientService restClientService;
    
    @GetMapping("/{id}")
    public MyOrders getOrders(@PathVariable int id,@RequestParam(value = "fromDate", required = false) String fromDate,@RequestParam(value = "toDate", required = false) String toDate) throws ParseException, java.text.ParseException{
        
        return restClientService.getMyOrders(id,fromDate,toDate  );
    }
	
}
