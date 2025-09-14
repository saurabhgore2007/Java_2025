package com.saurabh.example1;

public abstract class LibraryItem {

	String title;
	String author;
	
	public LibraryItem(String title, String author) {
		
		this.title = title;
		this.author = author;
	}
	
	public abstract void displayDetails();
	public abstract boolean matchesKeyword(String keyword);
}
