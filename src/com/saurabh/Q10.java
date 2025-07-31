package com.saurabh;

/*WAP to define a single array where you store 10 values of type string , integer and float. 
Define a following function having argument of type array 
a. getIntegerValues(): 
function determines which values are integers and returns new array contains integers 
b. getFloatValues(): 
function determines which values are float and returns new array contains float 
c. getIntegerString(): 
function determines which values are String and returns new array contains String*/

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		String []input = new String[10];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 10 Mix Values : ");
		
		for(int i=0;i<input.length;i++)
		{
			input[i] = scan.next();
		}
		
		String[] integers = getIntegerValues(input);
		System.out.println("Integers : ");
		for(int i=0;i<integers.length;i++) {
			if (integers[i] != null) {
		        System.out.println(integers[i]);
		    }
		}
		String[] floatValues = getFloatValues(input);
		System.out.println("Floats : ");
		for(int i=0;i<integers.length;i++) {
			if (floatValues[i] != null) {
		        System.out.println(floatValues[i]);
		    }
		}
		String[] strings =getIntegerString(input);
		System.out.println("Strings : ");
		for(int i=0;i<integers.length;i++) {
			if (strings[i] != null) {
		        System.out.println(strings[i]);
		    }
		}
		
	}
	
	public static String[] getIntegerValues(String []str) {

		String intValues[] =new String[str.length];
		for(int i=0;i<str.length;i++)
		{
			boolean flag=true;
			for (int j = 0; j < str[i].length(); j++) {
				
	            char ch = str[i].charAt(j);
	            
	            if (ch < '0' || ch > '9') {
	                flag = false;
	            }
	        }

	        if (flag) {
	            //System.out.println("Integer : " + str[i]);
	        	intValues[i] = str[i];
	        }

		}
		
		return intValues;
	}
	
	public static String[] getIntegerString(String []str) {
		String stringValues[] =new String[str.length];

		for(int i=0;i<str.length;i++)
		{
			boolean flag=true;
			for (int j = 0; j < str[i].length(); j++) {
				
	            char ch = str[i].charAt(j);
	            
	            if ( (ch < '0' || ch > '9') && ch!='.') {
	            	if(ch!='.') {
	                flag = false;
	            	}
	            }
	        }

	        if (!flag) {
	            //System.out.println("String : " + str[i]);
	        	stringValues[i] = str[i];
	        }

		}
		return stringValues;
	}
	
	public static String[] getFloatValues(String []str){
		String floatValues[] =new String[str.length];

		for(int i=0;i<str.length;i++)
		{
			boolean flag=false;
			for (int j = 0; j < str[i].length(); j++) {
				
	            char ch = str[i].charAt(j);
	            
	            if (ch=='.') {
	                flag = true;
	            }
	        }

	        if (flag) {
	            //System.out.println("String : " + str[i]);
	        	floatValues[i] = str[i];
	        }

		}
		return floatValues;
	}
}
