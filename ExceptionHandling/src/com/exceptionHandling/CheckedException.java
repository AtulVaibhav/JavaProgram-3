package com.exceptionHandling;

import java.sql.DriverManager;

class DemoException extends Exception{
	
}

public class CheckedException {
   public static void m1(){
	   //Class.forName("com.mysql.cj.jdbc.driver");
	  // DriverManager.getConnection("","","");
	   //throw new DemoException();
   }
	public static void main(String[] args) {
	   m1();
	   
	}

}
