package com.saurabh;

/* WAP to input two numbers and perform command line operations to print addition, subtraction,multiplication,
division, reminder where the arithmetic symbol is argument. Handle the error in case “arithmetic sign” is wrong

Sample Input (at commandline):
C:/foldername >> ProgramName  10     2      +

Sample Output:
Addition of 10 and 2 is 12.*/

import java.util.Scanner;

public class Q2 {
	public static void main(String []args)
	   {
		 int n1,n2;
         String ch;
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Enter First Number : ");
		 n1 = scan.nextInt();
		 System.out.println("Enter Second Number : ");
		 n2 = scan.nextInt();
		 System.out.println("Enter Operation : ");
		 ch = scan.next();
		 
		 switch(ch)
		 {
			 case "+":
			 System.out.println("Addition of "+n1+" and " +n2+" is : "+(n1+n2));
			 break;
			 case "-":
			 		 System.out.println("Addition of "+n1+" and " +n2+" is : "+(n1-n2));
			 break;
			 case "*":
			 		 System.out.println("Addition of "+n1+" and " +n2+" is : "+(n1*n2));
			 break;
			 case "/":
			 		 System.out.println("Addition of "+n1+" and " +n2+" is : "+(n1/n2));
			 break;
			 case "%":
			 		 System.out.println("Addition of "+n1+" and " +n2+" is : "+(n1%n2));
			 break;
		 }
	   }

}
