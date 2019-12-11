package com.nlsinc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//   a jar file is a collection of packages, and sub-packages
public class TestJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// JDBC - integration of JAVA with a RDBMS DATABASE
		// 1. You should have a database installed
		// 2. It should be running - start the service mysql80
		// 3. You should download mysqlconnector jar for 
		// mysql 8.x JDBC Driver for MySQL (Connector/J)	- 
		// 4. Add the above jar file to Eclipse JDBC project
		// 5. load the driver class
		
		 //Class.forName("com.mysql.cj.jdbc.Driver");
		 //System.out.println("Driver class loaded....");
		 
		 // 6. connect to the databse - we need
		     //a.  URL - protocol, ipaddress, portno and file path 
		     String arg0 = "jdbc:mysql://localhost:3306/world";
		     String arg1 = "root";
		     String arg2 ="test";
		    Connection con = DriverManager.getConnection(arg0, arg1, arg2);
		     System.out.println("Connected... 2 DB...");
		//7. Create a statement Object
		     Statement st = con.createStatement();
		     String sql = "Select * from CountryLanguage";// static sql statement means no parameters
	// 8. execute the sql command
		     ResultSet rs = st.executeQuery(sql);
		     //9 . get the data from ResultSet - is like a view of the current state of db
		     while(rs.next()){
		    	 
		    	  System.out.println(rs.getString(1) + " : " + rs.getString(2) + "   :  "+ rs.getString(3));
		     }
		     rs.close();
		     st.close();
		     con.close();
		  // Java acts as front end to database ( which is know as backend)   
		     
		     
	}

}
