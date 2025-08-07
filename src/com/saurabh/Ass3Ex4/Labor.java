package com.saurabh.Ass3Ex4;

public class Labor {

	private String laborName;
	private int age;
	private String town; 
	private String contactNo; 
	
	public Labor()
	{
		this.laborName = "#Unkwon_name";
		this.age = 0;
		this.town = "#unkown_town";
		this.contactNo = "xxxx";
	}
	
	public  Labor(String laborName,int age,String town,String contactNo)
	{
		this.laborName = laborName;
		this.age = age;
		this.town = town;
		this.contactNo = contactNo;
	}
	
	public String getLabor() {
        return laborName;
    }

	
	@Override
	public String toString() {
		return String.format("%12s %10d %20s %20s", laborName, age, town, contactNo);
	}
}

