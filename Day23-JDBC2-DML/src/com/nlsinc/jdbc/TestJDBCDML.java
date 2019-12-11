package com.nlsinc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//   a jar file is a collection of packages, and sub-packages
public class TestJDBCDML {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		//  connect to the databse - we need
		// a. URL - protocol, ipaddress, portno and file path
		String arg0 = "jdbc:mysql://localhost:3306/music";
		String arg1 = "root";
		String arg2 = "test";
		Connection con = DriverManager.getConnection(arg0, arg1, arg2);
		System.out.println("Connected... 2 DB...");
		// 1. insert data into table
		
		/*String sql = "insert into song values(103,'Polina Gagarina ','Kukushka')";
		Statement st = con.createStatement();
		boolean result = st.execute(sql); // for ddl it returns true and for dml return false
		System.out.println(result);*/
		// 2. update data in a table
		/*                                                              // new value which row ?
		String sql = "update song set title='Faded' where songid = 102";
		Statement st = con.createStatement();
		
		int count = st.executeUpdate(sql);
		System.out.println(count);
		
		*/
		// 3. delete data in a table
		
        
        String sql = "delete from song where songid=104";
        Statement st = con.createStatement();

        int count = st.executeUpdate(sql);
        System.out.println(count);



	}

}
