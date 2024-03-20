package com.learning;

class Employee{
	int id;
	String name;
	
	Employee(int i,String n){
		id=i;
		name=n;
	}
	
	
	Employee(Employee e){
		id = e.id;
		name = e.name;
	}
	
	
	public void show(){
		System.out.println("Id:"+id+" name:"+name);
	}
}

public class Constructor_IV {

	public static void main(String[] args) {
	  Employee e1 = new Employee(101,"Harsh");
       e1.show();
       Employee e2 = new Employee(e1);
       e2.show();
	}

}
