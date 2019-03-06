package com.tricon.myOrders.restClientService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tricon.myOrders.pojo.Customer;
import com.tricon.myOrders.pojo.MyOrders;
import com.tricon.myOrders.pojo.Order;
import com.tricon.myOrders.pojo.OrderedProduct;
import com.tricon.myOrders.pojo.Orders;
import com.tricon.myOrders.pojo.Product;

@Service
public class RestClientService {

	@LoadBalanced
	@Autowired
	RestTemplate restTemplate;
	
	public  MyOrders getMyOrders(int id,String fromDate, String toDate) {
		
		MyOrders myorders = new MyOrders();
		List<Orders> orders = new ArrayList<>();
		
		
		ResponseEntity<Customer> result = restTemplate.exchange("http://CUSTOMER/tricon/customer/" + id,
                HttpMethod.GET, null, Customer.class);
        Customer customer = result.getBody();
        myorders.setCustomer(customer);
 
        /*
         * Getting Order Details
         */
        
        String url = "http://ORDER/tricon/order/myorder/" + id + "/?fromDate=" + fromDate + "&toDate="
                + toDate;
        ResponseEntity<List<Order>> order = restTemplate.exchange(url, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Order>>() {
                });
        List<Order> myorder = order.getBody();
        Iterator<Order> iterator = myorder.iterator();
 
        while (iterator.hasNext()) {
            Order iterator_order_item = iterator.next();
            Orders myeachorder = new Orders(iterator_order_item.getId(), iterator_order_item.getOrderTime(),
                    iterator_order_item.getPaymentMode());
 
            List<OrderedProduct> ordered_product_details = new ArrayList<>();
            Iterator<OrderedProduct> iterator2 = iterator_order_item.getOrderedItems().iterator();
            while (iterator2.hasNext()) {
                OrderedProduct iterator2_orderProduct_item = iterator2.next();
                ResponseEntity<Product> result2 = restTemplate.exchange(
                        "http://PRODUCT/tricon/product/" + iterator2_orderProduct_item.getProduct(),
                        HttpMethod.GET, null, Product.class);
                OrderedProduct my_ordered_product_details = new OrderedProduct(result2.getBody(),
                        iterator2_orderProduct_item.getAmount(), iterator2_orderProduct_item.getCurrency(),
                        iterator2_orderProduct_item.getTax(), iterator2_orderProduct_item.getTotalAmount(),
                        iterator2_orderProduct_item.getScheduledDelivery(), iterator2_orderProduct_item.getArrivedDelivery(),
                        iterator2_orderProduct_item.getScheduledShipping(), iterator2_orderProduct_item.getArrivedShipping());
                ordered_product_details.add(my_ordered_product_details);
            }
            myeachorder.setMyOrderedProducts(ordered_product_details);
            orders.add(myeachorder);
        }
        myorders.setOrders(orders);
 
        return myorders;
	}
	
}
