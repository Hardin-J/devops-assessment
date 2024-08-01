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

import com.mrj.curtain_store.model.User;
import com.mrj.curtain_store.service.UserService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/users")
public class UserController {
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/all")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/{id}")
	public User getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}

	@PostMapping
	public String createUser(@RequestBody User user) {
		userService.saveUser(user);
		return "Creation Success";
	}

	@PutMapping("{id}")
	public String updateUser(@RequestBody User user) {
		userService.updateUser(user);
		return "Update Success";
	}

	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable("id") int id) {
		userService.deleteUser(id);
		return "Delete Success";
	}
}
