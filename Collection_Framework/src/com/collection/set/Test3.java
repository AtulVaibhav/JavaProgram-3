package com.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Test3 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(3);
		set.add(5);
		set.add(23);
		
		System.out.println(set);
		set.add(10);
		System.out.println(set);
		
//		set.add(null);
//		System.out.println(set);
		
		Iterator<Integer> itr = set.descendingIterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		set.remove(23);
		System.out.println(set);
		

	}

}
