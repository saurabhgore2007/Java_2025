package com.saurabh.example1;


public class MainApp {
   public static void main(String []args) {
	LibraryItem []items = { 
		    new Book("Java Mastery", "Shrenik"), 
		    new Magazine("Tech Today", "Deesha"), 
		    new DigitalMedia("AI Revolution", "Harsh") 
		}; 
		 
		LibraryItem []allResults = searchItems(items, "Harsh");
		for (LibraryItem item : allResults) {
			if(item != null) {
	        item.displayDetails();
			}
	    }
   }
   
   public static LibraryItem[] searchItems(LibraryItem[] items, String keyword) {
	    LibraryItem[] newResults = new LibraryItem[Searchable.MAX_RESULTS];
	    int count = 0;

	    for (LibraryItem item : items) {
	        if (item.matchesKeyword(keyword)) {
	        	newResults[count] = item;
	        	count++;
	            if (count == Searchable.MAX_RESULTS) 
	            	break;
	        }
	    }

	    return newResults;
	}
}
