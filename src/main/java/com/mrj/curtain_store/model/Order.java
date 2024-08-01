package com.mrj.curtain_store.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Order_table")
public class Order {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "order_id")
	private int orderId;
	
	@Column(name = "material")
	private String curtainMaterial;
	
	@Column
	private int quantity;
	
	@Column
	private int price;
	
	@ManyToOne(targetEntity = User.class, cascade = CascadeType.ALL)
	private User user;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, String curtainMaterial, int quantity, int price, User user) {
		super();
		this.orderId = orderId;
		this.curtainMaterial = curtainMaterial;
		this.quantity = quantity;
		this.price = price;
		this.user = user;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCurtainMaterial() {
		return curtainMaterial;
	}

	public void setCurtainMaterial(String curtainMaterial) {
		this.curtainMaterial = curtainMaterial;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	} 
}
