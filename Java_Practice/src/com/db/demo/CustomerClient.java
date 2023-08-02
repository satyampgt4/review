/**
 * 
 */
package com.db.demo;
import java.util.Scanner;

import com.db.bean.Cutomer;
import com.db.execption.CustomerIDIsInvalid;
import com.db.service.CustomerServices;

/**
 * 
 */
public class CustomerClient {

	/**
	 * @param args
	 */
	static Scanner in = new Scanner(System.in);  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CustomerServices service = new CustomerServices();
		System.out.print("Enter total customer : ");
	    int c = in.nextInt();
	    service.createArray(c);
		while(true)
		{
			
				System.out.print(
						"\r\n-----------cust menu------------\r\n"
						+ "1 create customer\r\n"
						+ "2 update customer\r\n"
						+ "3 delete customer\r\n"
						+ "4 list customer \r\n"
						+ "5 exit \r\n");
			 	
		        System.out.print("Enter your choice : ");
		        int op = in.nextInt();
				switch(op)
				{
				case 1 :createCustomerHelper(service);break;
				case 2 :updateCustomerHelper(service);break;
				case 3 :deleteCustomerHelper(service);break;
				case 4 :service.listCustomer();break;
				case 5 :return;
				}
		}
	}
	public static void createCustomerHelper(CustomerServices service) {
		
		Cutomer temp = new Cutomer();
		
		System.out.print("Enter your name: ");    
        String name = in.next();   
        temp.setCustomerName(name);  
		
        System.out.print("Enter your address: ");  
        String address = in.next();   
        temp.setCustomerAddress(address); 
        
        service.createCustomer(temp);
        
	}
	
	public static void updateCustomerHelper(CustomerServices service) {
		
		try {
		System.out.print("Enter id to update: ");   
		int id = in.nextInt();
		
		System.out.print("Enter your updated name: ");
        String name = in.next();   
        System.out.print("Enter your updated address: ");  
        String address = in.next();   
      
        service.updateCustomer(id,name,address);
		 }catch(CustomerIDIsInvalid e){
	      
			 System.out.println("Customer id not found "+ e.getId());
	      }
       
	}
	public static void deleteCustomerHelper(CustomerServices service) {
		
		try {
		System.out.print("Enter id to update: ");  
		int id = in.nextInt();
		service.deleteCustomer(id);
		 }catch(CustomerIDIsInvalid e){

			 System.out.println("Customer id not found "+ e.getId());
	      }
	}

}
