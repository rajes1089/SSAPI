package com.mylearning.ssapi.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mylearning.ssapi.bean.Product;
import com.mylearning.ssapi.services.ProductService;


@Controller
@RequestMapping(value="/products")
public class ProductController {
	
	@Inject
	private ProductService productService;
	
	
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody List<Product> listProducts(){
		return productService.getProducts();
	}
}
