package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(34);
		set.add(15);
		set.add(12);
		set.add(51);
		System.out.println(set);
		
		set.add(null);
		System.out.println(set);
		
		set.add(51);
		System.out.println(set);
		
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		System.out.println(set.contains(51));
		
		set.remove(51);
		System.out.println(set);
		
		System.out.println(set.size());

	}

}
