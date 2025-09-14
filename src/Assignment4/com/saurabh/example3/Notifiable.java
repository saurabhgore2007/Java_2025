package com.saurabh.example3;

public interface Notifiable {

	String DEFAULT_CHANNEL = "Email";
	void sendNotification(String message);
}
