package com.saurabh.example3;

public class CreditTransaction  extends Transaction implements Secure, Auditable {

	public CreditTransaction(double amount, String transactionID) {
		super(amount, transactionID);
	}

	@Override
	public void logTransaction(String transactionId) {
		
	}

	@Override
	public boolean encrypt(String data) {
		return data!=null;
	}

	@Override
	public boolean verifyUser(String userId) {
		return userId!=null;
	}

	@Override
	boolean validateTransaction() {
		return encrypt(transactionID);
	}

	@Override
	String executeTransaction() {
		
		return "₹" + amount + " credited successfully. Transaction ID: " + transactionID;	
	}

}
