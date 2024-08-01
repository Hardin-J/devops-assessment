package com.mrj.curtain_store.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User_table")
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "user_id")
	private int userId;
	
	@Column(name = "name")
	private String userName;
	
	@Column
	private String gender;
	
	@Column
	private String email;
	@Column
	private String phNumber;
	
	public User() {
		super();
	}
	
	public User(int userId, String userName, String gender, String email, String phNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.gender = gender;
		this.email = email;
		this.phNumber = phNumber;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhNumber() {
		return phNumber;
	}
	
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
}
