package com.mit.productsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mit.productsystem.entity.Product;
import com.mit.productsystem.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
	ProductService service;
	
    @PostMapping("/create")
	public Product createProduct(@RequestBody Product product) {
	return  service.createProduct(product);
    }
	@GetMapping("/getAllProducts")
	public List<Product> getAllProdutc(){
		return service.getAllProducts();
	}
	@GetMapping("/getByIdProduct/{id}")
	public Product getByIdProduct(@PathVariable Long id) {
		return service.getByIdProduct(id);
	}
	
	@GetMapping("/deleteByIdProduct/{id}")
	public String deleteByIdProduct(@PathVariable Long id) {
		service.deleteByIdProduct(id);
		return " Product Deleted Successfully";
	}
	
	
	
}
