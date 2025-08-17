package com.ProductManagement.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ProductManagement.dao.ProductDao;
import com.ProductManagement.entity.Product;
import com.ProductManagement.responsestructure.ResponseStructure;

@Service
public class ProductService {
	
	@Autowired
	ProductDao dao;
	
	public ResponseEntity<ResponseStructure<Product>> createProduct(Product p) {
		dao.saveProduct(p);
		ResponseStructure<Product> res = new ResponseStructure<>();
		res.setData(p);
		res.setLocaldatetime(LocalDateTime.now());
		res.setMessage("Added");
		res.setStatusCode(HttpStatus.FOUND.value());
		ResponseEntity<ResponseStructure<Product>>res2 = new ResponseEntity<ResponseStructure<Product>>(res,HttpStatus.FOUND);
	
		return res2;
		
		
	}

}

