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

import com.mylearning.ssapi.bean.Product;
import com.mylearning.ssapi.services.ProductService;


@RestController
@RequestMapping(value="/products")
public class ProductController {

	@Inject
	private ProductService productService;




	// @ResponseBody is an optional in @RestController but not in @Controller
	@RequestMapping(method=RequestMethod.GET)
	public List<Product> listProducts(){
		return productService.getProducts();
	}





	@RequestMapping(value={"/add"},method=RequestMethod.PUT)
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		productService.addProduct(product);
		return new ResponseEntity<Product>(HttpStatus.CREATED);
	}





	@RequestMapping(value={"/{id}"},method=RequestMethod.GET)
	public Product getProduct(@PathVariable Integer id){
		return productService.getProduct(id);
	}





	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Product> updateProduct(@RequestBody Product product){
		productService.updateProduct(product);
		return new ResponseEntity<Product>(HttpStatus.ACCEPTED);
	}




	@RequestMapping(value={"/{id}"},method=RequestMethod.DELETE)
	public ResponseEntity<Product> deleteProduct(@PathVariable Integer id){
		productService.deleteProduct(id);;
		return new ResponseEntity<Product>(HttpStatus.ACCEPTED);
	}


}
