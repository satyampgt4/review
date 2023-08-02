package com.db.service;

/**
 * 
 */


/**
 * 
 */
import java.io.*;
import com.db.execption.InsufficentFundsException;

public class BankService
{
   private double balance;
   private int number;
   
   public BankService(int number)
   {
      this.number = number;
   }
   
public void deposit(double amount)
   {
      balance += amount;
   }
   public void withdraw(double amount) throws InsufficentFundsException
   {
      if(amount <= balance)
      {
         balance -= amount;
      }
      else
      {
         double needs = amount - balance;
         throw new InsufficentFundsException(needs);
      }
   }
   public double getBalance()
   {
      return balance;
   }
   public int getNumber()
   {
      return number;
   }
}

