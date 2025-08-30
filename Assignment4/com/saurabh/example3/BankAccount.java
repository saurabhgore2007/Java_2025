package com.saurabh.example3;

public abstract class BankAccount {

	String accountHolder;
	String accountNumber;
	double balance;
	
	public BankAccount(String accountHolder,String accountNumber,double balance) {
		
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	abstract void deposite(double amount);
	abstract void withdraw(double amount);
	abstract void showAccountDetails();

}
