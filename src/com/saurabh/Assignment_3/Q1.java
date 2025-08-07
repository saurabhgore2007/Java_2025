package com.saurabh.Assignment_3;
/*WAP to create a class “Artist”. Declare variables to store uniqueid and name of artist. Define functions 
createNewArtist() and ask user to enter artist details, showArtist() to show artist details. 
 
Create objects of a class to handle records of 5 artists. Perform following operations on class objects 
1. findDuplicates() 
Check that which are duplicates (same artistid and name) 
2. showArrayObject() 
using Enhanced loop iterate each class object inside array and show “Artist” information. Function has 
argument of type “Object Array”*/
import java.util.Scanner;

public class Q1 {
	static class Artist {
        private String uniqueId;
        private String name;

        public void NewArtist() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter artist unique ID: ");
            uniqueId = scanner.next();
            System.out.print("Enter artist name: ");
            name = scanner.next();
        }

        public void showArtist() {
            System.out.println("\nArtist Details:");
            System.out.println("Unique ID: " + uniqueId);
            System.out.println("Name : " + name);
        }

    
    }

    public static void findDuplicates(Artist[] artists) {
        boolean flag = false;
        
        for (int i = 0; i < artists.length; i++) 
        {
            for (int j = i + 1; j < artists.length; j++) 
            {
                if (artists[i].uniqueId.equals(artists[j].uniqueId) && artists[i].name.equalsIgnoreCase(artists[j].name)) 
                {
                    System.out.println("Duplicate found between Artist " + (i + 1) + " and Artist " + (j + 1));
                    artists[i].showArtist();
                    flag = true;
                }		
            }
        }
        if (!flag) {
            System.out.println("No duplicates found.");
        }
    }

    public static void showArrayObject(Object[] Array) {
        System.out.println("\nAll Artist Objects");
        for (int i = 0; i < Array.length; i++) {
            if (Array[i]!=null) {
                ((Artist) Array[i]).showArtist();
            }
        }
    }


    public static void main(String[] args) {
        Artist[] artists = new Artist[2];

        for (int i = 0; i < artists.length; i++) 
        {
            System.out.println("Enter details of Artist " + (i + 1));
            artists[i] = new Artist();
            artists[i].NewArtist();
        }

        showArrayObject(artists);
        findDuplicates(artists);
    }

}
