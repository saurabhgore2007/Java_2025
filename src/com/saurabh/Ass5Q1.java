package com.saurabh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ass5Q1 {

	public static void main(String []args) {
		
		int []array = {50,40,20,60,10,30};
		
		ArrayList<Integer> records = new ArrayList<Integer>();
		
		for (int num : array) {
			records.add(num);
        }

		System.out.println("Without Sorting : " + records);
		
		//1. Sort and show ArrayList
		
		Collections.sort(records);
		System.out.println("After Sorting : " + records);

		//2. Shuffle Only first n values where value of n entered by user
		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter value of n : ");
	    int n = scan.nextInt();

		ArrayList<Integer> temp = new ArrayList<Integer>();

        for(int i=0;i<n;i++) {
        	temp.add(records.get(i));
        }
        
       
		Collections.shuffle(temp);

		for(int j=0;j<temp.size();j++) {
			if(temp.get(j) != null) {
			    records.set(j, temp.get(j));
			   // temp2.add(temp.get(j));
			}
			else {
				//records.set(j, records.get(j));
			}
		}
		System.out.println("After Shuffle : " + records);
       
		//3. Compare Last Three values with first value and print the difference between them
		
		if(records.size() >= 4) {
			int first = records.get(0);
			System.out.println("\nFirst Number is : " + first);
			
			for(int i = records.size()-3;i<records.size();i++) {
				int difference = first - records.get(i);
				System.out.println("Difference Between " + records.get(i) + " and " + first + " is " + difference);
			}
		}
	}
}
