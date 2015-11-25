package com.mylearning.ssapi.dao;

import java.util.List;

import com.mylearning.ssapi.bean.Order;

public interface OrderDao {
	
	public List<Order> getOrders();
	public void addOrder(Order p);
	public Order getOrder(Integer pid);
	public void deleteOrder(Integer pid);
	public void updateOrder(Order p);
	
}
