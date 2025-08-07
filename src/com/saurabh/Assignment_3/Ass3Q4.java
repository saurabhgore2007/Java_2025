package com.saurabh.Assignment_3;

import com.saurabh.Ass3Ex4.Contracts;
import com.saurabh.Ass3Ex4.Labor;
import com.saurabh.Ass3Ex4.Lorry;

public class Ass3Q4 {

	public static void main(String[] args) {
		
		Labor[] labors = {
				new Labor("John",37,"california","+1 7878987565"),
				new Labor("Smith",41,"moscow","+7 9099828394"),
				new Labor("Peter",29,"bijing","+86 9987364664"),
				new Labor("Michael",28,"Francisco","+1 9388475773"),
				new Labor()
	   };
		
	   Lorry[] lorrys = {
			   new Lorry("Panel truck",83774,20),
			   new Lorry("Flatbed truck",9929,65),
			   new Lorry("Dump truck ",10084,105)
	   };
	   
	   Contracts[] contracts = {
			   
			   new Contracts(91,"James",labors[1],lorrys[0]),
			   new Contracts(92,"Robert",labors[2],lorrys[0]),
			   new Contracts(93,"Richard",labors[1],lorrys[2]),
			   new Contracts(94,"Paul",labors[3],lorrys[1]),
			   new Contracts(),
			   new Contracts()

	   };
		
       System.out.print("\n\nLabors \n");
       for(Labor labor : labors) {
    	   System.out.println(labor);
       }
       
       System.out.print("\n\nLorry \n");
       for(Lorry lorry : lorrys) {
    	   System.out.println(lorry);
       }
       
       System.out.print("\n\nContracts \n");
       for(Contracts contract : contracts) {
    	   System.out.println(contract);
       }
  }
}

