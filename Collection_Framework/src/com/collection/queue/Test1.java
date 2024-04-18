package com.collection.queue;

import java.util.PriorityQueue;

public class Test1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		
		priorityQueue.add(20);
		priorityQueue.add(10);
		priorityQueue.add(30);
		priorityQueue.add(5);
		priorityQueue.add(3);
		
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.peek());
		priorityQueue.poll();
		System.out.println(priorityQueue.peek());
		priorityQueue.poll();
		System.out.println(priorityQueue.peek());
		
		

	}

}
