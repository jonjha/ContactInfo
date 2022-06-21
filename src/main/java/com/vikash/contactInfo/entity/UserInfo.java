package com.vikash.contactInfo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class UserInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	@Column 
	private String email;
	@Column 
	private String name;
	@Column 
	private String phone;
	@Column
	private String password;
	@Column
	private String UserType;
	
	
	
	public UserInfo(int userId, String email, String name, String phone, String password, String userType) {
		super();
		this.userId = userId;
		this.email = email;
		this.name = name;
		this.phone = phone;
		this.password = password;
		UserType = userType;
	}

	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return UserType;
	}

	public void setUserType(String userType) {
		UserType = userType;
	}
	
	
	
	
	

}
