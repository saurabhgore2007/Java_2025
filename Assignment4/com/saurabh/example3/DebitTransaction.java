package com.saurabh.example3;

public class DebitTransaction extends Transaction implements Secure, Taxable, Notifiable{

	public DebitTransaction(double amount, String transactionID) {
		super(amount, transactionID);
	}

	@Override
	public void sendNotification(String message) {
		System.out.println("Notification sent via " + DEFAULT_CHANNEL);
	}

	@Override
	public double calculateTax(double amount) {
		return amount*TAX_RATE;
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
		double tax = calculateTax(amount);
		sendNotification("Transaction of " + amount + " executed.");
        System.out.println("Tax deducted: " + tax);
        return "Transaction " + transactionID + " executed securely.";
	}

}
