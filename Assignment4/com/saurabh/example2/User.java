package com.saurabh.example2;

public abstract class User {

	String name;
	String email;
	
	public User(String name, String email) {
		
		this.name = name;
		this.email = email;
	}
	
	public abstract void showUserDetails();
}
