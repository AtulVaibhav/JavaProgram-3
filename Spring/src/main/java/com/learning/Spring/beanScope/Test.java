package com.learning.Spring.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("application-context.xml");
        
		Vehicle v1 = context.getBean("vehicle",Vehicle.class);
		Vehicle v2 = context.getBean("vehicle",Vehicle.class);
		
		if(v1==v2){
			System.out.println("Points to same object");
		}else{
			System.out.println("Points to different objects");
		}
	}

}
