package com.mrj.curtain_store.repository_implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mrj.curtain_store.model.User;
import com.mrj.curtain_store.repository.UserRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UserRepoImpl implements UserRepo {

	@Autowired
	EntityManager eManager;

	@Override
	public String save(User user) {
		try {
			eManager.persist(user);
			return "Success";
		} catch (Exception e) {
			return "Failure";
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAllUsers() {
		String hql = "from User";
		Query query = eManager.createQuery(hql);
		return query.getResultList();
	}

	@Override
	public User findById(int id) {

		User user = null;
		user = eManager.find(User.class, id);
		return user;
	}

	@Override
	public String delete(int id) {
		try {
			User user = eManager.find(User.class, id);
			if (user != null) {
				eManager.remove(user);
				return "Success";
			} else {
				return "Failure";
			}
		} catch (Exception e) {
			return "Failure";
		}
	}

	@Override
	public String update(User user) {
		int id = user.getUserId();
		User user2 = eManager.find(User.class, id);
		if (user2 != null) {
			eManager.merge(user);
			return "Success";
		} else {
			return "Failure";
		}
	}
}
