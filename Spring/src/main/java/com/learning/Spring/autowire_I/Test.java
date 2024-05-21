package com.learning.Spring.autowire_I;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("application-context.xml");
		System.out.println(context.getBean("category",Category.class));

	}

}
