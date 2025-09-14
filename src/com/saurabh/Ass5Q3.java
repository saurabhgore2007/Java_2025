package com.saurabh;

import java.util.ArrayList;
import java.util.Stack;

public class Ass5Q3 {

	public static void main(String[] args) {

		ArrayList<String> cities = new ArrayList<String>();
		ArrayList<Float> percentage = new ArrayList<Float>();
		ArrayList<Boolean> values = new ArrayList<Boolean>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<Integer> prime = new ArrayList<Integer>();

		//ArrayList of 5 name of cities
		cities.add("Sangli");
		cities.add("Pune");
		cities.add("Kolhapur");
		cities.add("Mumbai");
		cities.add("Sangli");
        
		System.out.println("Name of cities : " + cities);
		
		//ArrayList of 3 Semister Percentage 
		percentage.add(92.73f);
		percentage.add(92.55f);
		percentage.add(93.18f);

		System.out.println("3 Semister Percentage : " + percentage);

		//ArrayList of 2 boolean values 
		values.add(false);
		values.add(true);
		
		System.out.println("2 boolean values : " + values);

		//ArrayList of 5 integer numbers
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		numbers.add(500);

		System.out.println("5 integer numbers : " + numbers);

		
        //ArrayList of first 20 prime numbers between 1 to 100
		for(int i=2;i<=100 && prime.size()<20;i++)
		{
			int count=0;
			for(int d=2;d<i;d++)
			{
				if(i%d==0)		// (7%2)  (7%3)   (7%4)  (7%5)  (7%6)
					count++;
			}

			if(count==0)
			{
				prime.add(i);
			}
		}
		
		System.out.println("20 prime numbers : " + prime);

		Stack allElement = new Stack();
		
		allElement.push(cities);
		allElement.push(percentage);
		allElement.push(values);
		allElement.push(numbers);
		allElement.push(prime);

	    System.out.println("\n  Stack Objects ");
		for(Object item : allElement) {
			System.out.println(item);
		}
		
		allElement.pop();
		allElement.pop();

		System.out.println("\nTop Element : " + allElement.peek());
		System.out.println("\nStack is Empty or Not : " + allElement.empty());

	   }
}

