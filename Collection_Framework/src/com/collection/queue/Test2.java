package com.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test2 {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		
		deque.add(10);
		deque.addFirst(5);
		deque.addLast(20);
		deque.addFirst(100);
		
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());
		
		
		System.out.println(deque.pollFirst());
		System.out.println(deque);
		System.out.println(deque.pollLast());

	}

}
