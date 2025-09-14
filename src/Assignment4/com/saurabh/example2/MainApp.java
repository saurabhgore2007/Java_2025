package com.saurabh.example2;

public class MainApp {

	public static void main(String []args) {
		
		Customer c = new Customer("Shrenik", "shrenik@domain.com");
		
		PaymentMethod p = new CardPayment(4500); 
		
		if (p.validatePaymentDetails()) { 
		    String txnId = p.processTransaction(); 
		    ReceiptGenerator r = new SimpleReceipt(); 
		 
		    c.showUserDetails();
		    System.out.println(r.generateReceipt(txnId, p.amount)+"\n"); 
		} 	
		
        Customer customer = new Customer("Saurabh", "saurabh@gmail.com");
		
		PaymentMethod pay = new WalletPayment(10000); 
		
		if (pay.validatePaymentDetails()) { 
		    String txnId = pay.processTransaction(); 
		    ReceiptGenerator receipt = new SimpleReceipt(); 
		 
		    customer.showUserDetails();
		    System.out.println(receipt.generateReceipt(txnId, pay.amount)); 
		} 	
	}
}
