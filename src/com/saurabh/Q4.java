package com.saurabh;

/*WAP to read 5 programming languages names at command line and print them in ascending order.

Sample Input:
C:/foldername >> ProgramName  Python    Algol-c    Java   Cpp  Html

Sample Output:
Your Input at Command Line : Python    Algol-c    Java   Cpp  Html
Sorted Names of Programming Langauges : Algol-c    Cpp   Html  Java  Python*/

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
	public static void main(String []args)
	{
		 String str[]= new String[5];
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter 5 Strings : ");
		
		 for(int i=0;i<5;i++)
	     {
			 str[i] = scan.next();
		 }
	     System.out.println("Your inputs Before sorting are : ");
	     for(int i=0;i<str.length;i++)
	     {
			 System.out.println(str[i]);
		 }

         Arrays.sort(str);

		 System.out.println("Your inputs After sorting are : ");
		 for(int i=0;i<str.length;i++)
		 {
			 System.out.println(str[i]);
		 }

	}

}
