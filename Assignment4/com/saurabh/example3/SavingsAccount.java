package com.saurabh.example3;

public class SavingsAccount extends BankAccount implements Auditable, Taxable, Notifiable {

	public SavingsAccount(String accountHolder, String accountNumber, double balance) {
		super(accountHolder, accountNumber, balance);
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
	public void logTransaction(String transactionId) {
		
	}

	@Override
	void deposite(double amount) {
		balance +=amount;
		System.out.println("Deposited : " + amount);
	}

	@Override
	void withdraw(double amount) {
		balance -=amount;
		System.out.println("Withdrawn : " + amount);
	}

	@Override
	void showAccountDetails() {
		System.out.println("Account : " + accountNumber + " | Holder : " + accountHolder + " | Balance : " + balance);
	}

	
}
