package com.saurabh.example2;

public class Customer extends User{

	public Customer(String name,String email) {
		super(name,email);
	}

	@Override
	public void showUserDetails() {

		System.out.println("User : " + name + " (" + email + ")");
	}
}
