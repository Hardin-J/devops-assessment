package com.mrj.curtain_store.service_implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mrj.curtain_store.model.Order;
import com.mrj.curtain_store.repository.OrderRepo;
import com.mrj.curtain_store.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	private final OrderRepo orderRepo;

	public OrderServiceImpl(OrderRepo orderRepo) {
		this.orderRepo = orderRepo;
	}

	@Override
	public String saveOrder(Order order) {
		 return orderRepo.save(order);
	}

	@Override
	public Order getOrderById(int id) {
		return orderRepo.findById(id);
	}

	public List<Order> getAllOrders() {
		return orderRepo.findAllOrders();
	}

	@Override
	public String updateOrder(Order order) {
		return orderRepo.update(order);
	}

	@Override
	public String deleteOrder(int id) {
		return orderRepo.delete(id);
	}
}
