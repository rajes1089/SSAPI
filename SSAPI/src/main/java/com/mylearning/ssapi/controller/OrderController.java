package com.mylearning.ssapi.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mylearning.ssapi.bean.Order;
import com.mylearning.ssapi.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	
	@Inject
	private OrderService orderservice;
	

	@RequestMapping(method=RequestMethod.GET)
	public List<Order> listOrders(){
		return orderservice.getOrders();
	}
	
	
	@RequestMapping(method=RequestMethod.PUT)
	public ResponseEntity<Order> addOrder(@RequestBody Order order){
		orderservice.addOrder(order);
		return new ResponseEntity<Order>(HttpStatus.CREATED);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Order> updateOrder(@RequestBody Order order){
		orderservice.updateOrder(order);
		return new ResponseEntity<Order>(HttpStatus.ACCEPTED);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Order getOrder(@PathVariable int id){
		return orderservice.getOrder(id);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Order> deleteOrder(@PathVariable int id){
		orderservice.deleteOrder(id);
		return new ResponseEntity<Order>(HttpStatus.ACCEPTED);
	}
}
