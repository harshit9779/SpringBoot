package com.tricon.myOrders.pojo;

import java.util.Date;
import java.util.List;
 
import org.springframework.stereotype.Component;
 
import com.fasterxml.jackson.annotation.JsonFormat;
 

public class Orders {
    
   
	private int orderId;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy HH:mm")
    private Date orderTime;
    private String paymentMode;
    
    private List<OrderedProduct> OrderedProduct;
    
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public Date getOrderTime() {
        return orderTime;
    }
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }
    public String getPaymentMode() {
        return paymentMode;
    }
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
    public List<OrderedProduct> getMyOrderedProducts() {
        return OrderedProduct;
    }
    public void setMyOrderedProducts(List<OrderedProduct> myOrderedProducts) {
        this.OrderedProduct = myOrderedProducts;
    }
    
    
    
    public Orders(int orderId, Date orderTime, String paymentMode, List<OrderedProduct> OrderedProduct) {
        super();
        this.orderId = orderId;
        this.orderTime = orderTime;
        this.paymentMode = paymentMode;
        this.OrderedProduct = OrderedProduct;
    }
    
    public Orders(int i, Date orderTime, String paymentMode) {
        super();
        this.orderId = i;
        this.orderTime = orderTime;
        this.paymentMode = paymentMode;
    }
    public Orders() {
        super();
    }
    @Override
    public String toString() {
        return "Orders [orderId=" + orderId + ", orderTime=" + orderTime + ", paymentMode=" + paymentMode
                + ", OrderedProduct=" + OrderedProduct + "]";
    }
    
 
}
