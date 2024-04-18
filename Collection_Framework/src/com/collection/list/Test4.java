package com.collection.list;

import java.util.Iterator;
import java.util.Vector;

public class Test4 {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		vector.add(10);
		vector.add(20);
		vector.add(30);
		
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		for(int i=101;i<=111;i++){
			vector.add(i);
		}
		System.out.println(vector.capacity());
		//traversal
		for(Integer data:vector){
			System.out.print(data+" ");
		}
		System.out.println();
		
		Iterator<Integer> itr = vector.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		
		//indexing
		System.out.println(vector.get(2));
		
		
		//remove
		System.out.println(vector.remove(2));
		
		
		
		

	}

}
