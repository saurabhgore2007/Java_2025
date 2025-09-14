package com.saurabh.example2;

public abstract class PaymentMethod {

	double amount;
	
	public PaymentMethod(double amount) {
		this.amount = amount;
	}
	
	public abstract boolean validatePaymentDetails();
	public abstract String processTransaction();
}
