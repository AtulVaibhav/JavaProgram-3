package com.collection.list;

import java.util.Stack;

public class Test5 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(100);
		stack.push(80);
		stack.push(60);
		stack.push(40);
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
		
		

	}

}
