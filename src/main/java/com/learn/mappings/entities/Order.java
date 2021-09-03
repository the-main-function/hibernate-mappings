package com.learn.mappings.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="orders")
@Data
public class Order {

	@Id
	@GeneratedValue
	@Column(name="order_id")
	private int orderId;
	
	@OneToMany
	private List<Product> productList;
	
	@Column(name="total_price")
	private double totalPrice;
}
