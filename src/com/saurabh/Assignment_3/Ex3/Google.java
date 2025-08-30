package com.saurabh.Assignment_3.Ex3;

public class Google extends Login {
	
	@Override
	public void createLogin(String person_name, String username, String password) {

		super.person_name = person_name;
		super.username = username;
		super.password = password;

		if(isValid()) {
		System.out.println("\nHello "+ person_name +", Google Succesfully Created your Account.");
		}
		else {	
			System.out.println("\n Username or passoward is incorret. Please read policies");
		}
	}
}
