package com.mylearning.ssapi.services;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mylearning.ssapi.bean.Customer;
import com.mylearning.ssapi.dao.CustomerDao;

@Transactional
@Service
public class CustomerService {

	@Inject
	private CustomerDao customerDao;
	
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}
	
	public Customer getCustomer(Integer pid){
		return customerDao.getCustomer(pid);
	}
	
	public void addCustomer(Customer p) {
		customerDao.addCustomer(p);
	}
	
	public void updateCustomer(Customer p) {
		customerDao.updateCustomer(p);
	}
	
	public void deleteCustomer(Integer pid) {
		customerDao.deleteCustomer(pid);
	}
}
