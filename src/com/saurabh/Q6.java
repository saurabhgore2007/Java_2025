package com.saurabh;
/*WAP to input an Array of 5 float values. Define a function to take array and one integer value as argument to
search. Return Position of the search value in array and show the output. In Case the value is not exist in array
then print the index number and array value which is near to search value

Sample Input1 :
Enter 5 Integer array values  : 89.22  98.24  92.33   83.42  22.09
Enter value to Search  :   83.42

Sample Output1:
“83.42”  found at array position 3

Sample Input2 :
Enter 5 Integer array values  : 89.22  98.24  92.33   83.42  22.09
Enter value to Search  :   59.42*/
import java.util.Scanner;


public class Q6 {
	public static void main(String []args)
	{
		float value[]=new float[5];
		float index;
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter Any 5 float values");

        for(int i=0;i<5;i++)
        {
			value[i]= scan.nextFloat();
		}

	    System.out.println("Enter value to search : ");
	    index = scan.nextFloat();

		search(value,index);
	}

	public static void search(float x[],float in)
	{
		int y=0,position=0;
         for(int j=0;j<x.length;j++)
        {

			if(in==x[j])
			{
				y++;
				position=j;
			}
		}
		if(y==1)
		{
			System.out.println(in+" found at array position : "+position);
		}
		else
		{
		    System.out.println(in+" Not found at array position");
		}
     }

}
