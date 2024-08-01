package com.mrj.curtain_store.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrj.curtain_store.model.Order;
import com.mrj.curtain_store.service.OrderService;


@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/orders")
public class OrderController {
	
	private OrderService orderService;

	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	@GetMapping("/all")
	public List<Order> getAllOrders() {
		return orderService.getAllOrders();

	}

	@GetMapping("{id}")
	public Order getOrderById(@PathVariable int id) {
		return orderService.getOrderById(id);
	}

	@PostMapping
	public String addOrder(@RequestBody Order order) {
		orderService.saveOrder(order);
		return "Order Added";
	}

	@PutMapping("/{id}")
	public String updatetheOrder(@RequestBody Order order) {
		orderService.updateOrder(order);
		return "Order Updated";
	}

	@DeleteMapping("/{id}")
	public String deleteOrder(@PathVariable("id") int id) {
		orderService.deleteOrder(id);
		return "Order Removed";
	}

}
