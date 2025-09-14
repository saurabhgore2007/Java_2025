package com.saurabh.example2;

public interface SecureTransaction {

	int MAX_AMOUNT = 100000;
	String CURRENCY = "INR";
	
	boolean encryptData(String data);
	boolean verifyIdentity(String userId);
}
