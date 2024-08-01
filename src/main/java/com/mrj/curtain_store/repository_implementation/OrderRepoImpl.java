package com.mrj.curtain_store.repository_implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mrj.curtain_store.model.Order;
import com.mrj.curtain_store.repository.OrderRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class OrderRepoImpl implements OrderRepo {

	@Autowired
	EntityManager eManager;

	@Override
	public String save(Order order) {
		String msg = "";
		try {
			eManager.persist(order);
			msg = "Saved Success";
		} catch (Exception e) {
			msg = "Saved Failure";
		}
		return msg;
	}

	@Override
	public Order findById(int id) {
		Order order = eManager.find(Order.class, id);
		if (order != null) {
			return order;
		} else {
			return null;
		}
	}

	@Override
	public String delete(int id) {
		String msg = "";
		try {
			Order order = eManager.find(Order.class, id);
			if (order != null) {
				eManager.remove(order);
				msg = "Delete Success";
			} else {
				msg = "Delete Failure";
			}
		} catch (Exception e) {
			msg = "Order Not found";
		}
		return msg;
	}

	@Override
	public String update(Order newOrder) {
		String msg = "";
		Order oldOrder = eManager.find(Order.class, newOrder.getOrderId());
		if (oldOrder != null) {
			try {
				eManager.merge(newOrder);
				msg = "Update Success";
			} catch (Exception e) {
				msg = "Update Failure";
			}
		} else {
			msg = "Order Not found";
		}
		return msg;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Order> findAllOrders() {
		try {
			String hql = "from Order";
			Query query = eManager.createQuery(hql);
			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}

}
