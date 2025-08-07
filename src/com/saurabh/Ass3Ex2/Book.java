package com.saurabh.Ass3Ex2;

public class Book {

	public int bookid;
	public String bookname;
	public Auther auther_obj;
	public Publication publication_obj;
	
	public void addBook(int bookid, String bookname, Auther a, Publication p) {
		
		this.bookid = bookid;
		this.bookname = bookname;
		auther_obj = a;
		publication_obj = p;
	}
	
	@Override
	public String toString() {
		return  String.format("Book ID : %5d   Book Name : %20s \tAuther Info: %10s \tPublication Info : %20s",this.bookid,this.bookname,this.auther_obj,this.publication_obj);
	}
}

