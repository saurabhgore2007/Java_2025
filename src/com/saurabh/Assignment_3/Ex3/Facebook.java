package com.saurabh.Assignment_3.Ex3;

public class Facebook extends Login {

	private String friend_name;
	
	@Override
	public void createLogin(String person_name, String username, String password) {

		super.person_name = person_name;
		super.username = username;
		super.password = password;

		if(isValid()) {
		System.out.println("Hello "+ person_name +", Facebook Succesfully Created your profile.");
		}
		else {	
			System.out.println("Username or passoward is incorret. Please read policies");
		}
	}

	public void requestFriend() {
			
		System.out.println("\n Enter Friend Name : ");
		friend_name = scan.next();
		
		System.out.println("\n Facebook "+ friend_name +" Friend requested. Will notify you once acccepted");

	}
}
