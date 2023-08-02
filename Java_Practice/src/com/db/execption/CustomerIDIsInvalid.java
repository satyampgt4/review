package com.db.execption;

public class CustomerIDIsInvalid extends Exception {

	 private int id ;
	   public CustomerIDIsInvalid(int id)
	   {
	    this.id= id;
	   } 
	   public int getId()
	   {
		   return id;
	   }

}