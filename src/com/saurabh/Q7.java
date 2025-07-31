package com.saurabh;
/*WAP to input array contains 5 String values. Define a function which has String array argument. Return a new
array which has  “Strings which not contains any symbol and number”.

Sample Input :
Enter 5 Strings   :   Minal    Admin@123     Vaidehi@gmail.com   Hello World     Deesha

Sample Output:
Here I found the String values which not contains Symbols and numbers
Minal,  Hello World,   Deesha */
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str[] = new String[5];

        System.out.println("Enter 5 strings : ");
		for(int i=0;i<str.length;i++)
		{
			str[i] = scan.next();
		}

		//System.out.println();

		pureStrings(str);
	}
	public static void pureStrings(String []arr) {

        String newString[] = new String[5];


        for(int i=0;i<arr.length;i++)
		{
			String newStr="";
	        for(int j=0;j<arr[i].length();j++)
	        {
				char ch = arr[i].charAt(j);
				if(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch ==' ')
				{
					newStr+=ch;
				}

			}
	        if(arr[i].length()==newStr.length()) {
			newString[i] = newStr;
			System.out.println(newString[i]);
	        }
		}


	}

}
