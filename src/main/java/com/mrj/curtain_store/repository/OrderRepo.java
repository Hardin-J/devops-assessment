package com.mrj.curtain_store.repository;

import java.util.List;

import com.mrj.curtain_store.model.Order;

public interface OrderRepo {

	public String save(Order order);

	public Order findById(int id);

	public String delete(int id);

	public String update(Order order);

	public List<Order> findAllOrders();

}
