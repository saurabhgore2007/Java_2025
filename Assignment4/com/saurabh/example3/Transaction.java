package com.saurabh.example3;

public abstract class Transaction {

	double amount;
	String transactionID;
	
	public Transaction(double amount,String transactionID) {
		this.amount = amount;
		this.transactionID = transactionID;
	}
	
	abstract boolean validateTransaction();
	abstract String executeTransaction();
}
