package com.saurabh;

/*WAP to input any Number and show that which digit from the input number is max.

Sample Input:
Enter any Number : 73844022

Sample Output:
Here, I found “8” as Max Digit in “73844022”*/

import java.util.Scanner;


public class Q3 {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);

		int num;

		System.out.println("Enter number : ");
		num = scan.nextInt();

        int max = 0,number=num;

		while (number > 0) {
		    int digit = number % 10;
		    if (digit > max) {
		        max = digit;
		    }
		    number /= 10;
		}

		System.out.println("Here, I found "+max+" as Max Digit in "+ num);


	}

}
