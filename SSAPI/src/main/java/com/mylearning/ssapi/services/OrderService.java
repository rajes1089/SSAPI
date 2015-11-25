package com.mylearning.ssapi.services;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mylearning.ssapi.bean.Order;
import com.mylearning.ssapi.dao.OrderDao;

@Transactional
@Service
public class OrderService {

	@Inject
	private OrderDao orderDao;
	
	public List<Order> getOrders() {
		return orderDao.getOrders();
	}
	
	public Order getOrder(Integer pid){
		return orderDao.getOrder(pid);
	}
	
	public void addOrder(Order p) {
		orderDao.addOrder(p);
	}
	
	public void updateOrder(Order p) {
		orderDao.updateOrder(p);
	}
	
	public void deleteOrder(Integer pid) {
		orderDao.deleteOrder(pid);
	}
}
