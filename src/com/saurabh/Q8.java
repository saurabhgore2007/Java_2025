package com.saurabh;

/*WAP to  define a following functions 
A. takeConstructionData()  
to read the absolute measurements given by a civil engineer related to one of construction project. They 
are contruction_name in String, area in sq.ft in float, estimate_time in days in integer, estimate_cost in 
doller in float.  
 
The function creates its object by using “Object” class and return.  
 
B. submitConstructionData() 
Takes Object-Type argument and print all the details. Calculates and show the service charge amount as 
per the following condition 
1. estimate_time >= 300 days then service charge*/

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
	

	}
	
	public static class data {
		String constructionName;
        float Area,estimateCost;
        int estimateTime;
        
        public data(String name, float area, int time, float cost) 
        {
           constructionName = name;
           Area = area;
           estimateTime = time;
           estimateCost = cost;
        }

	}

	public static Object takeConstructionData() {
		Scanner scan = new Scanner(System.in);
		
		String contruction_name;
		float area,estimate_cost;
		int estimate_time;
		
		System.out.println("Enter Construction Name : ");
		contruction_name = scan.next();
		System.out.println("Enter Area in sq.ft : ");
		area = scan.nextFloat();
		System.out.println("Enter Estimate time in Days : ");
		estimate_time = scan.nextInt();
		System.out.println("Enter Estimate Cost in $: ");
		estimate_cost = scan.nextFloat();
		
		data allData = new data(contruction_name,area,estimate_time,estimate_cost);
		return allData;
	}
	
    public static void submitConstructionData() {
		
    	System.out.println("Construction Name : ");
    	System.out.println("Area in sq.ft : ");
    	System.out.println("Estimated time in Days : ");
    	System.out.println("Estimated Cost : $");
	}
}
