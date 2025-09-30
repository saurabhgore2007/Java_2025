package com.saurabh.Ex2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {

		LinkedList<Document> allObjects = new LinkedList<Document>();
		
		for(int i=0;i<10;i++) {
			allObjects.add(new Document(i+1 , "Doc-"+(i+1),allObjects.size()*4));
		}
		allObjects.add(new Document(9 , "Doc-9" , 32.00f));
		allObjects.add(new Document(9 , "Doc-9" , 32.00f));
		allObjects.add(new Document(8 , "Doc-8" , 28.00f));
		allObjects.add(new Document(8 , "Doc-8" , 28.00f));
		
		function1(allObjects);
		List<Document> merged =  function2(allObjects);
		
		Comparator<Document> c1 = new Comparator<Document>() {
		
		@Override 
		public int compare(Document d1 , Document d2) {
			
			if(d1.docid > d2.docid)
				return +1;
			else if(d1.docid < d2.docid)
				return -1;
			else
				return 0;
		 }
		};
		
		Collections.sort(merged , c1);
		
		System.out.println("\n\nAfter Merge Are:");
	    for (Document doc : merged) {
	        System.out.print(doc);
	    }
	}

	public static void function1(List<Document> list) {
		
	    LinkedList<Document> duplicates = new LinkedList<Document>();

	    for(int i=0;i<list.size();i++) {
	    	
	    	for(int j=i+1;j<list.size();j++) {
		    	if(!duplicates.contains(list.get(i))) {
		    	if(list.get(i).docid==list.get(j).docid  && 
		    	   list.get(i).docname.equals(list.get(j).docname) &&
		    	   list.get(i).filesize==list.get(j).filesize) {
		    		
		    	   duplicates.add(list.get(i));
		    	}
		    	}
		    }
	    }
	    
	    if(!duplicates.isEmpty()) {
	    System.out.println("Duplicates Are:");
	    for (Document doc : duplicates) {
	        System.out.print(doc);
	    }
	}
	    else {
	    	System.out.println("\nNo Duplicates are Found\n");
	    }
	}
	
	public static List function2(List<Document> mlist) {
	
		LinkedList<Document> temp = new LinkedList<>(mlist);
		for(int i=0;i<mlist.size();i++) {
	    	
	    	for(int j=i+1;j<mlist.size();j++) {
	    		
		    	if(mlist.get(i).docid==mlist.get(j).docid  && 
		    	   mlist.get(i).docname.equals(mlist.get(j).docname) &&
		    	   mlist.get(i).filesize==mlist.get(j).filesize) {
		    		temp.remove(mlist.get(i));
		    		
		    	}
		    	
		    }
	    }
	    return temp;
	}
}
