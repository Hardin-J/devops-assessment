package com.mrj.curtain_store.service;

import java.util.List;

import com.mrj.curtain_store.model.User;

public interface UserService {
	
	User getUserById(int id);

	String saveUser(User user);

	String deleteUser(int id);

	String updateUser(User user);

	List<User> getAllUsers();

}
