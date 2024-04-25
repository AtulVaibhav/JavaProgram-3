package com.learning.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData_I {
    public static void fetchRecordById(int productId) throws ClassNotFoundException, SQLException{
    	String sql ="select * from product where productId ="+productId;
    	
    	Statement stmt = ConnectionCode.getConnection().createStatement();
    	ResultSet resultSet = stmt.executeQuery(sql);
    	System.out.println("Product details");
    	System.out.println("______________________");
    	while(resultSet.next()){
    		System.out.println("ProductId    :"+resultSet.getInt(1));
    		System.out.println("ProductName  :"+resultSet.getString(2));
    		System.out.println("ProductPrice :"+resultSet.getInt(3));
    	}
    }
	public static void main(String[] args) {
		try {
			fetchRecordById(2);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
