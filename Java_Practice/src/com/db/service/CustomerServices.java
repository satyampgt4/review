/**
 * 
 */
package com.db.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.db.bean.Cutomer;
import com.db.execption.CustomerIDIsInvalid;
/**
 * 
 */
public class CustomerServices {

	List<Cutomer> customer ;
	public void createArray(int c)
	{
		 customer =  new ArrayList<Cutomer>(c);
	}
	int i =0;
	 Scanner in = new Scanner(System.in); 
	 
	public void createCustomer(Cutomer cust) {

		cust.setCutomerId(101+customer.size());
        customer.add(cust);
		i++;
		
		System.out.println("customer is created with id : "+cust.getCutomerId());
	}
	
	
	
	public void listCustomer() {
		System.out.println("------list of customer------ ");
		
		for(Cutomer cust: customer )
		{

				System.out.println("customer details:  " +cust.getCutomerId()+ "   "+ cust.getCustomerName() + "   "+cust.getCustomerAddress());
	
		}
		
	}
	public boolean updateCustomer(int id,String name, String address) throws CustomerIDIsInvalid {
		
		
		

			boolean notFound = true;	
		
		for(Cutomer cust: customer )
		if(cust.getCutomerId()==id) {
				
			notFound = false;
        cust.setCustomerName(name);  
        cust.setCustomerAddress(address); 
		
		System.out.println("customer" + id+ " updated");
			}
		

		if(notFound)
			throw new CustomerIDIsInvalid(id);
		
		return true;
	}
	public boolean deleteCustomer(int id) throws CustomerIDIsInvalid {
		
		boolean notFound = true;	
		
		for(int j=0; j< customer.size(); j++)
		{
			if(customer.get(j).getCutomerId()==id) {
			
				notFound = false;
				
				customer.remove(j);
		System.out.println("customer" + id+" is deleted");
			}
			}
		
		if(notFound)
			throw new CustomerIDIsInvalid(id);

		return true;
	}
}
