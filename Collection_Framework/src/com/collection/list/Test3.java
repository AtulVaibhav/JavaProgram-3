package com.collection.list;

import java.util.LinkedList;

public class Test3 {
   public static void printLinkedList(LinkedList<Integer> list){
	   System.out.print("head--->");
	   for(Integer data:list){
		   System.out.print(data+"--->");
	   }
	   System.out.println("null");
   }
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		for(int i=1;i<=10;i++){
			linkedList.add(i);
		}
		
		printLinkedList(linkedList);
		
		//allows indexing
		System.out.println(linkedList.get(2));
		
		//update
		linkedList.set(2, 100);
		printLinkedList(linkedList);
		
		//insert data at given index position
		linkedList.add(5, 3000);
		printLinkedList(linkedList);
		
		//insert value at beginning
		linkedList.addFirst(-10);
		printLinkedList(linkedList);
		
		//insert value at the end
		linkedList.addLast(5000);
		printLinkedList(linkedList);
		
		//read
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
        System.out.println(linkedList.peek());
        
        
        //remove
        System.out.println(linkedList.pollFirst());
        printLinkedList(linkedList);
        
        System.out.println(linkedList.pollLast());
        printLinkedList(linkedList);
        
        linkedList.remove(2);
        printLinkedList(linkedList);
        
        //size
        System.out.println(linkedList.size());
        
        
        //contains
        System.out.println(linkedList.contains(3000));
        
	}

}
