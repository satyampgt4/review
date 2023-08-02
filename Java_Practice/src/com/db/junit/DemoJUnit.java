package com.db.junit;

public class DemoJUnit {


	public static void main(String[] args) {
	

	}
	 public static int findMax(int arr[]){  
	        int max=0;  
	        for(int i=1;i<arr.length;i++){  
	            if(max<arr[i])  
	                max=arr[i];  
	        }  
	        return max;  
	    }  
}
