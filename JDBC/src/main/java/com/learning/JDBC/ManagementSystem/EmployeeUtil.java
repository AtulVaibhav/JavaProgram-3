package com.learning.JDBC.ManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeUtil {
   private static final String url = "jdbc:mysql://localhost:3306/jdbc";
   private static final String username = "root";
   private static final String password = "root";
   
   private static Connection con = null;
   
   public static Connection getConnection() throws ClassNotFoundException, SQLException{
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   if(con==null){
		   con = DriverManager.getConnection(url,username,password);
	   }
	   return con;
   }
   public static String addEmployee(Employee emp) throws ClassNotFoundException, SQLException{
	   String sql ="insert into emp (empName,deptName,salary) values(?,?,?)";
	   Connection con = getConnection();
	   PreparedStatement preparedStatement = con.prepareStatement(sql);
	   preparedStatement.setString(1, emp.getEmpName());
	   preparedStatement.setString(2, emp.getDeptName());
	   preparedStatement.setDouble(3, emp.getSalary());
	   
	   int i = preparedStatement.executeUpdate();
	   if(i>0){
		   return "Employee added successfully";
	   }
	   return "Insertion failed";
   }
   
   public static void getEmpById(int empId) throws ClassNotFoundException, SQLException{
	   String sql = "select * from emp where empId=?";
	   Connection con = getConnection();
	   PreparedStatement preparedStatement = con.prepareStatement(sql);
	   preparedStatement.setInt(1, empId);
	   ResultSet resultSet = preparedStatement.executeQuery();
	   while(resultSet.next()){
		   System.out.println("Id :"+resultSet.getInt(1));
		   System.out.println("Name :"+resultSet.getString(2));
		   System.out.println("Dept :"+resultSet.getString(3));
		   System.out.println("Salary :"+resultSet.getDouble(4));
		   System.out.println("___________________________________");
	   }
   }
   public static void getAll() throws ClassNotFoundException, SQLException{
	   String sql = "select * from emp";
	   Connection con = getConnection();
	   PreparedStatement preparedStatement = con.prepareStatement(sql);
	   ResultSet resultSet = preparedStatement.executeQuery();
	   while(resultSet.next()){
		   System.out.println("Id :"+resultSet.getInt(1));
		   System.out.println("Name :"+resultSet.getString(2));
		   System.out.println("Dept :"+resultSet.getString(3));
		   System.out.println("Salary :"+resultSet.getDouble(4));
		   System.out.println("___________________________________");
	   }
   }
   
   public static String updateEmployee(int id,Employee updatedEmployee) throws ClassNotFoundException, SQLException{
	   String sql = "update emp as e set e.deptName=?, e.salary=? where e.empId=?";
	   Connection con = getConnection();
	   PreparedStatement preparedStatement = con.prepareStatement(sql);
	   preparedStatement.setString(1, updatedEmployee.getDeptName());
	   preparedStatement.setDouble(2, updatedEmployee.getSalary());
	   preparedStatement.setInt(3, id);
	   
	   int i = preparedStatement.executeUpdate();
	   if(i>0){
		   return "Employee updated successfully";
	   }
	   return "Updation failed";
	   
   }
   
   public static String deleteEmployee(int empId) throws ClassNotFoundException, SQLException{
	   String sql = "delete from emp where empId=?";
	   Connection con = getConnection();
	   PreparedStatement preparedStatement = con.prepareStatement(sql);
	   preparedStatement.setInt(1, empId);
	   int i = preparedStatement.executeUpdate();
	   if(i>0){
		   return "Employee deleted successfully";
	   }
	   return "Deletion failed";
   }
   
}
