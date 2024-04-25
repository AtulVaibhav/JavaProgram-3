package com.learning.JDBC;

import java.sql.SQLException;
import java.sql.Statement;

public class TableCreation {
    public static String createTable() throws ClassNotFoundException, SQLException{
    	String sql = "create table product (productId int(10) primary key auto_increment,"
    			+ "productName varchar(20) not null,productPrice int(20) not null)";
    	
    	Statement stmt = ConnectionCode.getConnection().createStatement();
    	stmt.execute(sql);
    	return "Table created successfully";
    }
	public static void main(String[] args) {
		try {
			System.out.println(createTable());
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
