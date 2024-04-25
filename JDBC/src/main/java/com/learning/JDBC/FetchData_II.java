package com.learning.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData_II {
    public static void fetchRecords() throws ClassNotFoundException, SQLException{
    	String sql ="select * from product";
    	
    	Statement stmt = ConnectionCode.getConnection().createStatement();
    	ResultSet resultSet = stmt.executeQuery(sql);
    	System.out.println("Product details");
    	System.out.println("______________________");
    	while(resultSet.next()){
    		System.out.println("ProductId    :"+resultSet.getInt(1));
    		System.out.println("ProductName  :"+resultSet.getString(2));
    		System.out.println("ProductPrice :"+resultSet.getInt(3));
    		System.out.println("_________________________________________");
    	}
    }
	public static void main(String[] args) {
		try {
			fetchRecords();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
