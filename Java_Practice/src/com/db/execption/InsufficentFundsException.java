package com.db.execption;

/**
 *  We can create any custom exception class extending the Exception
 */
public class InsufficentFundsException extends Exception {

	private double amount;
	   public InsufficentFundsException(double amount)
	   {
	      this.amount = amount;
	   } 
	   public double getAmount()
	   {
	      return amount;
	   }
	   
	  

}