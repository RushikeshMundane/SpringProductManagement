package com.ProductManagement.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProductManagement.entity.Product;

public interface ProductJpa extends JpaRepository<Product, Integer>{

	
	
}
