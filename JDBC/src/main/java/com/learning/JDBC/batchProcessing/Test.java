package com.learning.JDBC.batchProcessing;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.learning.JDBC.ManagementSystem.EmployeeUtil;

public class Test {
    public static void doOperation() throws ClassNotFoundException, SQLException{
    	Connection con = EmployeeUtil.getConnection();
    	Statement stmt = con.createStatement();
    	
    	String sql1 = "insert into student (name) values ('Harsh'),('Amit'),('Yogesh')"; 
    	String sql2 = "delete from student where id=1";
    	
    	stmt.addBatch(sql1);
    	stmt.addBatch(sql2);
    	
    	int[] arr = stmt.executeBatch();
    	if(arr.length>0){
    		System.out.println("Success");
    	}else{
    		System.out.println("Failed");
    	}
    	
    }
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		doOperation();

	}

}
