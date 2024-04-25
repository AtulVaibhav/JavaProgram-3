package com.learning.JDBC;

import java.sql.SQLException;
import java.sql.Statement;

public class InsertOperation {
    public static String insertData() throws ClassNotFoundException, SQLException{
    	String sql = "insert into product(productName,productPrice) "
    			+ "values ('Laptop',78000), ('Mobile',67000),('TV-Sets',58000)";
    	
        Statement stmt = ConnectionCode.getConnection().createStatement();
        int i = stmt.executeUpdate(sql);
        if(i>0){
        	return "Data inserted successfully";
        }
        return "Insertion failed";
    }
	public static void main(String[] args) {
		try {
			System.out.println(insertData());
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
