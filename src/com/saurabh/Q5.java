package com.saurabh;
/*WAP to input n1 and n2 as integer. Print Numbers from n1 to n2. Define Switch Case menus as
“1. Even Number”,    “2. Prime Number”  ,  “3. Palindrome Numbers”.
Take a choice from user and solve the requirement */
import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n1,n2,input,i;
		System.out.println("Enter First Number : ");
		n1 = scan.nextInt();
		System.out.println("Enter Second Number : ");
		n2 = scan.nextInt();


        for(i=n1;i<=n2;i++)
			{
				 System.out.println(i+",");
			}
      int count=0;
      while (count <5) {

	    System.out.println("\nSelect option");
	    System.out.println("\n1. Even Number");
	    System.out.println("\n2. Prime Number");
	    System.out.println("\n3. Palindrome Numbers");
        System.out.println("\n4. Exit");
		System.out.println("\nChoice : ");
		input = scan.nextInt();

		switch(input)
		{
			case 1:
			System.out.println("Even numbers are \n");
			for(i=n1;i<=n2;i++)
			{
				if(i%2==0)
				System.out.println(i+",");
			}
			break;

			case 2:
			System.out.println("Prime numbers are \n");
		    prime(n1,n2);
			break;

			case 3:
			System.out.println("\nPalindrome Numbers are : ");
            palindrome(n1,n2);
			break;
			case 4:
	          System.exit(0);
			break;
		}
		 count++;
	}
	}

	public static void prime(int x,int y)
	{
		for(int j=x;j<=y;j++)
		   {
				int count=0;
				for(int a=2;a<j;a++)
				{
					if(j%a==0)
						{
							count++;
						}
				}
				if(count==0)
				{
		             System.out.println(j);
			    }
			}
	}

	public static void palindrome(int a, int b) {

	   for (int k = a; k <= b; k++) {
	        int num = k, reversed = 0,rem;
	        while (num != 0) {
				rem=num%10;
	            reversed = reversed * 10 + rem;
	            num /= 10;
	        }
	        if (k == reversed) {
	            System.out.print(k + ", ");
	        }
	    }

	
}

}
