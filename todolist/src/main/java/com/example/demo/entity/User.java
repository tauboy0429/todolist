package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userid;
	private String username;
	private String password;
	private String name;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, String name) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
