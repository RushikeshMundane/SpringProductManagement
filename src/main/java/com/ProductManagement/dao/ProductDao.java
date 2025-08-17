package com.ProductManagement.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ProductManagement.entity.Product;
import com.ProductManagement.jpa.ProductJpa;

@Repository
public class ProductDao {

	@Autowired
	ProductJpa jpa;
	
	public Product saveProduct(Product p) {
		return jpa.save(p);
	}
	
	
	
}
