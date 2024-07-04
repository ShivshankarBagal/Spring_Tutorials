package com.test.entities;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Controller;


public class LoginData {
	
	
	@NotBlank(message = "User name can not blank")
	@Size(min=3, max=20, message="userName between 3 - 20 characters")
	private String userName;
	@Email ()
	private String email;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginData(String userName, String email) {
		super();
		this.userName = userName;
		this.email = email;
	}
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + "]";
	}

	
}
