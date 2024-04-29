package com.learning.JDBC.ManagementSystem;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Employee e1 = new Employee("Harsh","dev",78000);
		Employee e2 = new Employee("Amit","testing",56000);
		
		//EmployeeUtil.addEmployee(e1);
		//EmployeeUtil.addEmployee(e2);
		
		//EmployeeUtil.getAll();
		
		//EmployeeUtil.getEmpById(2);
		
//		Employee e3 = new Employee("Amit","dev",71000);
//		System.out.println(EmployeeUtil.updateEmployee(2, e3));
		
		System.out.println(EmployeeUtil.deleteEmployee(2));

	}

}
