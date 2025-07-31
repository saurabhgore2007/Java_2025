package com.saurabh;
/*WAP to  enroll admission for College Students by defining following functions. 
1. enrollStudent() 
read student name, highest qualification, scored marks, university name 
create object array of these details using “Object” class from lang package. 
2. validateInput() 
function takes argument of type “Object” array and check each value is entered correctly or not. 
 
Validation Requirement 
Name should not contain symbols and numbers, qualification should be either [ssc,hsc,graduate,post 
graduate], scored marks should be in 1 to 100, university name should not contains numbers and symbols 
except .(dot). 
Function should return following error code by occurrence for wrong input 
Error Code For -1 Everything correct 
101 Invalid name 
102 Invalid Qualification 
103 Invalid Scored Marks 
104 Invalid University Name 
 
In function enrollStudent() call function validateInput() and prompt error message.*/

import java.util.Scanner;

 class Details{
	
	String name,qualification,university;
	int marks;
	public Details(String name, String qualification, int marks, String university) 
	 {
        this.name = name;
        this.qualification = qualification;
        this.marks = marks;
        this.university = university;
     }
   }

    public class Q9 {

	public static void main(String[] args) 
	{
		enrollStudent();
	}
    

	public static void enrollStudent() {

		String name,qualification,university;
		int marks;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        name = scan.next();
        
        System.out.print("Enter highest qualification (ssc/hsc/graduate/post graduate): ");
        qualification = scan.next();
        
        System.out.print("Enter scored marks (1-100): ");
        marks = scan.nextInt();
      
        System.out.print("Enter university name: ");
        university = scan.next();
         
        Details student = new Details(name, qualification, marks, university);
        int errorCode = validateInput(student);
        
        switch(errorCode)
        {
           case -1:
        	   System.out.println("Student Registration Successful!");
        	   break;
           case 101:
        	   System.out.println("Invalid name");
        	   break;
           case 102:
        	   System.out.println("Invalid Qualification");
        	   break;
           case 103:
        	   System.out.println("Invalid Scored Marks ");
        	   break;
           case 104:
        	   System.out.println("Invalid University Name");
        	   break;
        }

		
	}
	public static int validateInput(Details student) {
 
		String Name = student.name.toLowerCase(); 
		String universityName = student.university.toLowerCase(); 

		String[] qualifications = new String[] { "ssc", "hsc", "graduate", "post graduate" };
		
		for(int i=0;i<Name.length();i++)
		{	
	        char ch = Name.charAt(i);
	         
	        if (!((ch >= 'a' && ch <= 'z') || ch == ' ')) {
	             return 101;
	         }
	    }

		for(int j=0;j<qualifications.length;j++)
		{
			if(!(student.qualification.contains(qualifications[j])))
			{
				return 102;
			}
		}
		 
		if(student.marks<1 && student.marks>100)
		{
			return 103;
		}
		
		for(int i=0;i<universityName.length();i++)
		{	
	        char ch = universityName.charAt(i);
	         
	        if (!((ch >= 'a' && ch <= 'z') || ch == '.' || ch==' ')) {
	             return 104;
	         }
	    }
		 return -1;
	}
}
