package com.learning.JDBC;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteOperation {
  public static String deleteProduct(int productId) throws ClassNotFoundException, SQLException{
	  String sql = "delete from product where productId="+productId;
	  Statement stmt = ConnectionCode.getConnection().createStatement();
	  int i = stmt.executeUpdate(sql);
	  if(i>0){
		  return "Product deleted successfully";
	  }
	  return "Deletion failed";
  }
	public static void main(String[] args) {
		try {
			System.out.println(deleteProduct(3));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
