package com.saurabh.Assignment_3;

import java.util.Scanner;

import com.saurabh.Ass3Ex2.Auther;
import com.saurabh.Ass3Ex2.Book;
import com.saurabh.Ass3Ex2.Publication;

public class Ass3Q2 {

	public static void main(String[] args) {
           
		Scanner scan = new Scanner(System.in);
		String input;
		
		Auther a1 = new Auther(); 
		a1.createNewAuther(101, "George Orwell");
        Auther a2 = new Auther(); 
        a2.createNewAuther(102, "J.K. Rowling");
        Auther a3 = new Auther(); 
        a3.createNewAuther(103, "Harper Lee");
        Auther a4 = new Auther(); 
        a4.createNewAuther(104, "George Orwell"); 

        Publication p1 = new Publication(); 
        p1.createNewPublication(201, "Penguin Books");
        Publication p2 = new Publication(); 
        p2.createNewPublication(202, "Bloomsbury");
        Publication p3 = new Publication(); 
        p3.createNewPublication(203, "HarperCollins");
        Publication p4 = new Publication(); 
        p4.createNewPublication(204, "Vintage");

        Book[] books = new Book[4];

        books[0] = new Book();
        books[0].addBook(301, "1984", a1, p1);

        books[1] = new Book();
        books[1].addBook(302, "Harry Potter", a2, p2);

        books[2] = new Book();
        books[2].addBook(303, "To Kill a Mockingbird", a3, p3);

        books[3] = new Book();
        books[3].addBook(304, "Animal Farm", a4, p4);

        sortBookByName(books);
        
        System.out.println("Search by Auther name : ");
        input = scan.nextLine();
		
        searchBookByAuther(books,input);
        
	}

	public static void searchBookByAuther(Book []books,String authername) {
		
		for(Book x : books) {
			if(x.auther_obj.auther_name.equals(authername)) {
				System.out.println(x);
			}
		}
	}
	
	public static void sortBookByName(Book []books) {
		
		for(int i=0;i<books.length-1;i++) {
			for(int j=0;j<books.length - 1 - i;j++) {
				
				if(books[j].bookname.compareTo(books[j + 1].bookname)>0) {
					    Book temp = books[j]; 
			            books[j] = books[j + 1];
			            books[j + 1] = temp;
				}
			}
		}
		System.out.println("Books sorted by name : ");
	    for (Book b : books) {
	        System.out.println(b);
	    }

	}
}

