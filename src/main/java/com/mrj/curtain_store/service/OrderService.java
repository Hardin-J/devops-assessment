package com.mrj.curtain_store.service;

import java.util.List;

import com.mrj.curtain_store.model.Order;

public interface OrderService {
	
	Order getOrderById(int id);

	String saveOrder(Order order);

	String deleteOrder(int id);

	String updateOrder(Order order);

	List<Order> getAllOrders();

}
