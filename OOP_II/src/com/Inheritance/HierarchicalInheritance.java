package com.Inheritance;

class Employee{
	public void getCompanyName(){
		System.out.println("ABC Pvt Ltd");
	}
}

class SoftwareEnginners extends Employee{
	public void getDeptName(){
		System.out.println("Resarch & Development");
	}
	public void getsalary(){
		System.out.println("50000");
	}
}

class Accountants extends Employee{
	public void getDeptName(){
		System.out.println("Accounts department");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		SoftwareEnginners softwareEnginners  = new SoftwareEnginners();
		softwareEnginners.getDeptName();
		softwareEnginners.getCompanyName();
		softwareEnginners.getsalary();
		
		
		Accountants accountants = new Accountants();
		accountants.getDeptName();
		accountants.getCompanyName();
		
		
		

	}

}
