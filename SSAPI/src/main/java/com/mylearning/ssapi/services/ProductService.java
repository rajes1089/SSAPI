package com.mylearning.ssapi.services;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mylearning.ssapi.bean.Product;
import com.mylearning.ssapi.dao.ProductDao;

@Transactional
@Service
public class ProductService {

	@Inject
	private ProductDao productDao;
	
	public List<Product> getProducts() {
		return productDao.getProducts();
	}
	
	public List<Product> getProducts(String name) {
		return productDao.getProducts(name);
	}
	
	public Product getProduct(Integer pid){
		return productDao.getProduct(pid);
	}
	
	public void addProduct(Product p) {
		productDao.addProduct(p);
	}
	
	public void updateProduct(Product p) {
		productDao.updateProduct(p);
	}
	
	public void deleteProduct(Integer pid) {
		productDao.deleteProduct(pid);
	}
}
