package com.db.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demojdbc {

	// Step 1
	static int indx = 300;
	static Scanner in = new Scanner(System.in); 
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/test";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "NewPassword";
	
	
	
	public static void main(String[] args) {
	
		// Step 2 
		// Declare the Coneection or prepaidstatement variable here 
		   Connection conn = null;
		   PreparedStatement stmt = null;
		   
		   try{
			   
			   // Step 3 Regiater Driver here and create connection 
			   
			   Class.forName(JDBC_DRIVER);

			   // Step 4 make/open  a connection 
			   
			      System.out.println("Connecting to database...");
			      conn = DriverManager.getConnection(DB_URL,USER,PASS);
			   
			      
			      //STEP 4: Execute a query
//			      System.out.println("Creating statement...");
			      //String sql = "UPDATE emps set age=? WHERE id=?";
			     // String sql1="delete from emp where id=?";
			     // stmt.setInt(1, 101);
			      // Hard coded data 
			      
			      while(true){
						
							System.out.print(
									"\r\n-----------emp menu------------\r\n"
											+ "1 create emp\r\n"
											+ "2 update emp\r\n"
											+ "3 delete emp\r\n"
											+ "4 list emp \r\n"
											+ "5 exit \r\n");
								 	
						 	
					        System.out.print("Enter your choice : ");
					        int op = in.nextInt();
							switch(op)
							{
							case 1 :inserthelper(conn);break;
							case 2 :updatehelper(conn);break;
							case 3 : deletehelper(conn);break;
							case 4 :listhelper(conn);break;
							case 5 : conn.close();return;
							}
					}
			   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
			      //finally block used to close resources
			     
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
			   System.out.println("Goodbye!");
}//end main

			   
static void inserthelper( Connection conn)
{
	PreparedStatement stmt = null;
    //STEP 4: Execute a query
    System.out.println("Creating statement...");
    String sql="insert into emp values(?,?,?,?)";

    try {
		stmt = conn.prepareStatement(sql);
	
		
	int id=indx++;
	System.out.println("Enter name:");
    String name= in.nextLine();

	System.out.println("Enter address:");
    String address=in.nextLine();

	System.out.println("Enter location:");
    String location=in.nextLine();
    //Bind values into the parameters.
    stmt.setInt(1, id);  // This would set age
    stmt.setString(2,name);
    stmt.setString(3, address);
    stmt.setString(4, location);
    stmt.executeUpdate();
         
 

 
 // Let us update age of the record with ID = 102;
//    int rows = stmt.executeUpdate();
//    System.out.println("Rows impacted : " + rows );


    stmt.close();
    listhelper(conn);
    } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}
static void deletehelper( Connection conn)
{
	PreparedStatement stmt = null;
    //STEP 4: Execute a query
    System.out.println("Creating statement...");
    String sql="delete from emp where id=?";

    try {
		stmt = conn.prepareStatement(sql);
	
	System.out.println("Enter Id to delete:");
	int id= in.nextInt();
//    String name="Sakshi";
//    String address="Mumbai";
//    String location="india";
    //Bind values into the parameters.
    stmt.setInt(1, id);  // This would set age
//    stmt.setString(2,name);
//    stmt.setString(3, address);
//    stmt.setString(4, location);
    stmt.executeUpdate();
         
 

 
 // Let us update age of the record with ID = 102;
//    int rows = stmt.executeUpdate();
//    System.out.println("Rows impacted : " + rows );

    // Let us select all the records and display them.

    stmt.close();
    listhelper(conn);
    } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}
static void updatehelper( Connection conn)
{
	PreparedStatement stmt = null;
    //STEP 4: Execute a query
    System.out.println("Creating statement...");
  String sql = "UPDATE emp set name=?, address=?, location ? WHERE id=?";

    try {
		stmt = conn.prepareStatement(sql);
	
		
		System.out.println("Enter Id to update:");
		int id= in.nextInt();
	System.out.println("Enter name:");
    String name= in.nextLine();

	System.out.println("Enter address:");
    String address=in.nextLine();

	System.out.println("Enter location:");
    String location=in.nextLine();

    stmt.setString(1,name);
    stmt.setString(2,address);
    stmt.setString(4,location);
    stmt.setInt(2, id);  // This would set age
;
    stmt.executeUpdate();
         
 

 
 // Let us update age of the record with ID = 102;
    int rows = stmt.executeUpdate();
    System.out.println("Rows impacted : " + rows );

    stmt.close();
    listhelper(conn);
    } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}
		

static void listhelper( Connection conn)
{
	  try {
	PreparedStatement stmt = null;
    //STEP 4: Execute a query
    System.out.println("Creating statement...");
  String  sql = "SELECT id, name ,address, location FROM emp";
  stmt = conn.prepareStatement(sql);
    ResultSet rs = stmt.executeQuery(sql);

    //STEP 5: Extract data from result set
    while(rs.next()){
       //Retrieve by column name
       int eid  = rs.getInt("id");
       String name1 = rs.getString("name");
       String address1 = rs.getString("address");
       String location1 = rs.getString("location");

       //Display values
       System.out.print("ID: " + eid);
       System.out.print(", Name: " + name1);
       System.out.print(", Address: " + address1);
       System.out.println(", Location: " + location1);
    }
    //STEP 6: Clean-up environment
   // rs.close();
    stmt.close();
    } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}
		
}


	


