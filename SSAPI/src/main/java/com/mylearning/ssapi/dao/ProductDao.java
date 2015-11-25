package com.mylearning.ssapi.dao;

import java.util.List;

import com.mylearning.ssapi.bean.Product;

public interface ProductDao {
	
	public List<Product> getProducts();
	public List<Product> getProducts(String Name);
	public void addProduct(Product p);
	public Product getProduct(Integer pid);
	public void deleteProduct(Integer pid);
	public void updateProduct(Product p);
	
}
