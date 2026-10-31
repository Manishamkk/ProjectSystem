package com.mit.productsystem.service;

import java.util.List;

import com.mit.productsystem.entity.Product;

public interface ProductService {

	Product createProduct(Product product);
	List<Product> getAllProducts();
	Product getByIdProduct(Long id);
	String deleteByIdProduct(Long id);
	
	
}
