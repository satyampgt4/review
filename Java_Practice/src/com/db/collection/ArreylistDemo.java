/**
 * 
 */
package com.db.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 */
public class ArreylistDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List al =  new ArrayList();
		System.out.println("intital size:"+ al.size());
		
		al.add("mumbai");
		al.add("delhi");
		al.add("new york");
		al.add("colombo");
		al.add("pune");
		al.add("mumbai");
		al.add("mumbai");
		
		System.out.println("intital size:"+ al.size());
		
	
	 // Iterable interface 
    
    // Iterator is interface which is using to iterate the Collection
    Iterator<String> i=al.iterator();
    while(i.hasNext()){
  	  
  	  String test=i.next();
  	  System.out.println("detals of Capital------>" +test);
    }

    

    // Another way to iterate the collection using for loop 
    
 // Loop through elements.
       for (String value : al) {
   	    
   	    System.out.println("Element: " + value);
   	}

}
