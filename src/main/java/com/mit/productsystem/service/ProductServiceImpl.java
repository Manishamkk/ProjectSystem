package com.mit.productsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mit.productsystem.entity.Product;
import com.mit.productsystem.exception.ProductNotFoundException;
import com.mit.productsystem.repository.ProductRepository;
@Service
public class ProductServiceImpl  implements ProductService{
    @Autowired
	ProductRepository repo;
	
	@Override
	public Product createProduct(Product product) {
		return repo.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return repo.findAll();
	}

	
	@Override
	public String deleteByIdProduct(Long id) {
		 repo.deleteById(id);
		 return "Record Deleted Successfully";
	}

	@Override
	public Product getByIdProduct(Long id) {
		  return repo.findById(id)
		            .orElseThrow(() ->
		                new ProductNotFoundException(
		                    "Product not found with id: " + id
		                )
		            );
	}

}
