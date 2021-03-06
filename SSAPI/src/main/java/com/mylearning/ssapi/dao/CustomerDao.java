package com.mylearning.ssapi.dao;

import java.util.List;

import com.mylearning.ssapi.bean.Customer;

public interface CustomerDao {
	
	public List<Customer> getCustomers();
	public void addCustomer(Customer c);
	public Customer getCustomer(Integer cid);
	public void deleteCustomer(Integer cid);
	public void updateCustomer(Customer c);
	
}
