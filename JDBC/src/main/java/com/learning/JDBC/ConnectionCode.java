package com.learning.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCode {
	private static final String jdbc_url = "jdbc:mysql://localhost:3306/jdbc";
	private static final String username = "root";
	private static final String password = "root";
	private static Connection con = null;
	
   public static Connection getConnection() throws ClassNotFoundException, SQLException{
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   if(con==null){
		   con = DriverManager.getConnection(jdbc_url,username,password);
	   }
	   return con;
   }
	public static void main(String[] args) {
		try {
			System.out.println(getConnection());
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
