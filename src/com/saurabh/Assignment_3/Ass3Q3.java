package com.saurabh.Assignment_3;

import com.saurabh.Assignment_3.Ex3.Facebook;
import com.saurabh.Assignment_3.Ex3.Google;

public class Ass3Q3 {

	public static void main(String[] args) {

		Facebook user1 = new Facebook();
		user1.createLogin("Saurabh", "saurabh123", "Saurabh@123");
		user1.requestFriend();
		
		Google user2 = new Google();
		user2.createLogin("Saurabh", "saurabh123", "Saurabh@123");
	}

}
