package com.saurabh.example2;

public class SimpleReceipt extends ReceiptGenerator{

	@Override
	public String generateReceipt(String transactionId, double amount) {

		return "Transaction Successful: " + transactionId + "\nAmount: " + amount + " " + SecureTransaction.CURRENCY ;
	}

}
