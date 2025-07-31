package com.saurabh;

//WAP to Print Min and Max value for the primitive data types along with Memory Size

public class Q1 {
	   public static void main(String []args)
	   {
		System.out.println("Byte      : Min value = "+ Byte.MIN_VALUE + " Max value = " + Byte.MAX_VALUE + " Size = "+ Byte.SIZE / 8 +"bytes");
		System.out.println("\nShort     : Min value = "+ Short.MIN_VALUE + " Max value = " + Short.MAX_VALUE + " Size = "+ Short.SIZE / 8 +"bytes");
		System.out.println("\nInteger   : Min value = "+ Integer.MIN_VALUE + " Max value = " + Integer.MAX_VALUE + " Size = "+ Integer.SIZE / 8 +"bytes");
		System.out.println("\nLong      : Min value = "+ Long.MIN_VALUE + " Max value = " + Long.MAX_VALUE + " Size = "+ Long.SIZE / 8 +"bytes");
		System.out.println("\nFloat     : Min value = "+ Float.MIN_VALUE + " Max value = " + Float.MAX_VALUE + " Size = "+ Float.SIZE / 8 +"bytes");
		System.out.println("\nDouble    : Min value = "+ Double.MIN_VALUE + " Max value = " + Double.MAX_VALUE + " Size = "+ Double.SIZE / 8 +"bytes");
		System.out.println("\nBoolean   : Min value = "+ Boolean.FALSE + " Max value = " + Boolean.TRUE + " Size = "+"1bytes");
		System.out.println("\nCharacter : Min value = "+ Character.MIN_VALUE + " Max value = " + Character.MAX_VALUE + " Size = "+ Character.SIZE / 8 +"bytes");
	    //System.out.println("\nString : "+ " Size = "+ String.SIZE / 8 +"bytes");

	}
}
