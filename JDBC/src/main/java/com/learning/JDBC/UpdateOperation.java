package com.learning.JDBC;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateOperation {
   public static String updateProduct(int productId,int updatedPrice) throws ClassNotFoundException, SQLException{
	   String sql ="update product as p set p.productPrice="+updatedPrice
	   		+ " where p.productId="+productId;
	   Statement stmt = ConnectionCode.getConnection().createStatement();
	   int i = stmt.executeUpdate(sql);
	   if(i>0){
		   return "Product updated successfully";
	   }
	   return "Updation failed";
   }
	public static void main(String[] args) {
	try {
		System.out.println(updateProduct(3, 99000));
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	

	}

}
