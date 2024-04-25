package com.functionalInterfaces;

import java.util.Date;

@FunctionalInterface
interface Example{
	//void m1();
	//int getDate();
	//void add(int a,int b);
	
	int getSum(int[] arr);
}

//class ExampleImpl implements Example{
//
//	@Override
//	public void m1() {
//		System.out.println("m1() called");
//		
//	}
//	
//}

public class LambdaExpression {

	public static void main(String[] args) {
//		Example e1 = new ExampleImpl();
//		e1.m1();
		
		//Lambda Expressions
//		Example e1 = ()->{System.out.println("m1() called");};
//		e1.m1();
		
//		Example e2 = ()->{return new Date().getDay();};
//		System.out.println(e2.getDate());
		
//		
//		Example e3 = (a,b)->{System.out.println(a+b);};
//		e3.add(12, 13);
		
		
		Example e4 = (arr)->{
			int sum=0;
			for(int data:arr){
				sum += data;
			}
			return sum;
		};
		int[] ar = {1,2,4,6};
		int result = e4.getSum(ar);
		System.out.println(result);
		
		
		
	}

}
