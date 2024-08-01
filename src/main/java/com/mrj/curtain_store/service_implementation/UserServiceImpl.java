package com.mrj.curtain_store.service_implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mrj.curtain_store.model.User;
import com.mrj.curtain_store.repository.UserRepo;
import com.mrj.curtain_store.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepo repo;

	public UserServiceImpl(UserRepo repo) {
		this.repo = repo;
	}

	@Override
	public String saveUser(User user) {
		return repo.save(user);
	}

	@Override
	public User getUserById(int id) {
		return repo.findById(id);
	}

	@Override
	public List<User> getAllUsers() {
		return repo.findAllUsers();
	}

	@Override
	public String updateUser(User user) {
		return repo.update(user);
	}

	@Override
	public String deleteUser(int id) {
		return repo.delete(id);
	}

}
