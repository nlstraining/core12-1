package com.nlsinc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//   a jar file is a collection of packages, and sub-packages
public class TestJDBC {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		// Class.forName("com.mysql.cj.jdbc.Driver");
		// System.out.println("Driver class loaded....");

		// a. URL - protocol, ipaddress, portno and file path
		String arg0 = "jdbc:mysql://localhost:3306/world";
		String arg1 = "root";
		String arg2 = "test";
		Connection con = DriverManager.getConnection(arg0, arg1, arg2);
		System.out.println("Connected... 2 DB...");
		// 7. Create a statement Object
		Statement st = con.createStatement();
		String sql = "Select * from CountryLanguage";// static sql statement
														// means no parameters
		// 8. execute the sql command
		ResultSet rs = st.executeQuery(sql);
		// 9 . get the data from ResultSet - is like a view of the current state
		// of db
		// it is a datastructure similar to a (array)vector or matrix - rows and
		// columns
		while (rs.next()) {

			System.out.println(rs.getInt(1) + " : " + rs.getString(2)
					+ "   :  " + rs.getString(3));

		}
		rs.close();
		st.close();
		con.close();
		// Java acts as front end to database ( which is know as backend)
		
		

	}

}
