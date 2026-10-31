package com.mit.productsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name= "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    @Column(name = "product_name")
	private String name;
    @Column(name = "product_category")
	private String category;
    @Column(name = "product_description")
	private String description;
    @Column(name = "product_price")
	private Integer price;
    @Column(name = "product_quantity")
	private Integer quantity;
	
	
	
}
