package com.saurabh.Assignment_3.Ex3;

import java.util.Scanner;

public abstract class Login {

	protected String person_name;
	protected String username;
	protected String password;
	
	Scanner scan = new Scanner(System.in);
	
	public abstract void createLogin (String person_name,String username, String password);
	
	public boolean isValid() 
	{ 
    
		boolean unamecorrect, pwdcorrect;
		unamecorrect = pwdcorrect = false;
		int n = username.length();
		String lwrusername = username.toLowerCase(); 
		if(lwrusername. equals(username) && n>=6 && n <= 18)
		unamecorrect = true;

		int cnt1,cnt2,cnt3, cnt4;
		cnt1=cnt2=cnt3=cnt4=0;
		for(int i=0;i<password.length();i++)
		{

		if(password.charAt(i)>=65 && password.charAt(i) <= 90)
		cnt1++;
		else if(password.charAt(i)>=97 && password.charAt(i) <= 122)
		cnt2++;
		else if(password.charAt(i)>=48 && password.charAt(i) <= 57)

		cnt3++;
		else
		cnt4++;
		}
		if(password.length()>=8 && cnt1>=1 && cnt2>=1 && cnt3>=1 && cnt4>=1)
		pwdcorrect= true;
		if(unamecorrect == true && pwdcorrect == true)
		return true;
		else
		return false;
	}
}
