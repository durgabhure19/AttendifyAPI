package com.db.attend.api.model;


public class LoginRequest {
	private String username;
	private String password;
	
	public LoginRequest() {
		// TODO Auto-generated constructor stub
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
	
}
