package com.saurabh.Ass3Ex2;

public class Publication {
	
	public int publication_id;
	public String publication_name;
	
	public void createNewPublication(int publication_id, String publication_name){
		this.publication_id = publication_id;
		this.publication_name = publication_name;
	}
	
	@Override
	public String toString() {
		return  String.format("\tPublication ID : %10d \tPublication Name : %20s",this.publication_id,this.publication_name);
	}
}

