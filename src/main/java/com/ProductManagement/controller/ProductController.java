package com.ProductManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ProductManagement.entity.Product;
import com.ProductManagement.responsestructure.ResponseStructure;
import com.ProductManagement.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService ps;
	
	@PostMapping("/create")
	public ResponseEntity<ResponseStructure<Product>> saveProduct(@RequestBody Product p){
		return ps.createProduct(p);
	}
	
}
