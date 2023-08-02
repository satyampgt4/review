/**
 * 
 */
package com.db.demo;
import com.db.execption.InsufficentFundsException;
import com.db.service.BankService;
/**
 * 
 */
public class BankDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 BankService c = new BankService(101);
	      System.out.println("Depositing $500...");
	      c.deposit(500.00);
	      try
	      {
	         System.out.println("\nWithdrawing $100...");
	         c.withdraw(100.00);
	         System.out.println("\nWithdrawing $600...");
	         c.withdraw(600.00);
	      }catch(InsufficentFundsException e)
	      {
	         System.out.println("Sorry, but you are short $"
	                                  + e.getAmount());
	        // e.printStackTrace();
	      }
	    
	}
}
