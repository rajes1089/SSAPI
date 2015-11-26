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

import com.mylearning.ssapi.bean.Customer;
import com.mylearning.ssapi.services.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Inject
	private CustomerService customerService;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Customer> listCustomers(){
		return customerService.getCustomers();
	}
	
	
	@RequestMapping(value="/add",method=RequestMethod.PUT)
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
		customerService.addCustomer(customer);
		return new ResponseEntity<Customer>(HttpStatus.CREATED);
	}
	
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Customer getCustomer(@PathVariable int id){
		return customerService.getCustomer(id);
	}
	
	
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
		customerService.updateCustomer(customer);
		return new ResponseEntity<Customer>(HttpStatus.ACCEPTED);
	}
	
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Customer> deleteCustomer(@PathVariable int id){
		customerService.deleteCustomer(id);
		return new ResponseEntity<Customer>(HttpStatus.ACCEPTED);
	}

}
