/**
 * 
 */
package com.db.execption;

/**
 * 
 */
public class demoExecption {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		int a =10,b =0;
		int c = a/b;
		System.out.println(c);
		} catch(Exception ex){
			System.out.println("invalid opeation :"+ ex);
		}finally {
			System.out.println("program ended");
		}
		
	}

}
