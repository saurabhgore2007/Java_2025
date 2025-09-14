package com.saurabh.example2;

public class CardPayment extends PaymentMethod implements SecureTransaction{

	public CardPayment(double amount) {
		super(amount);
	}

	@Override
	public boolean encryptData(String data) {
		return false;
	}

	@Override
	public boolean verifyIdentity(String userId) {
		return false;
	}

	@Override
	public boolean validatePaymentDetails() {
		return amount<=MAX_AMOUNT;
	}

	@Override
	public String processTransaction() {
		return "TXN12345";
	}

}
