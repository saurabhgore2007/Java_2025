package com.saurabh.Ass3Ex4;

public class Lorry {

	 private String lorry_name;
	 private int vehicle_number;
	 private int weight_of_goods_in_tons;
	 
	 public Lorry() 
	 {
		 this.lorry_name = "Unkwon_name";
		 this.vehicle_number = 00000;
		 this.weight_of_goods_in_tons = 0;
	 }
	 
	 public Lorry(String lorry_name,int vehicle_number,int weight_of_goods_in_tons) 
	 {
		 this.lorry_name = lorry_name;
		 this.vehicle_number = vehicle_number;
		 this.weight_of_goods_in_tons = weight_of_goods_in_tons;
	 }
	
	 public String getLorry() {
	        return lorry_name;
	    }
	 
	 public int lorryNumber() {
	        return vehicle_number;
	    }

	 @Override
	 public String toString() {
		 return String.format("%20s %10d %10d", lorry_name, vehicle_number,weight_of_goods_in_tons);
	 }
}
