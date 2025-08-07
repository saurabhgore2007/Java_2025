package com.saurabh.Ass3Ex2;

public class Auther {

	public int auther_id;
	public String auther_name;
	
	public void createNewAuther(int auther_id, String auther_name){
		this.auther_id = auther_id;
		this.auther_name = auther_name;
	}
	
	@Override
	public String toString() {
		return  String.format("\tAuther ID : %8d \tAuther Name : %10s",this.auther_id,this.auther_name);
	}
}
