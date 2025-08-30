package com.saurabh.example3;

public interface Auditable {

	String AUDIT_LOG_PATH = "/audit/logs";
	void logTransaction(String transactionId);
	
}
