package com.mrj.curtain_store.repository;

import java.util.List;

import com.mrj.curtain_store.model.User;

public interface UserRepo {
	
	public String save(User us);
	
//	public User findByName(String name);
	
	public User findById(int id);
	
	public String delete(int id);

	public String update(User user);

	public List<User> findAllUsers();

}
