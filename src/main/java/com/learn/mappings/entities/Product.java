package com.learn.mappings.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="products")
@Data
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name="product_id")
	private int productId;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	private double price;
}
