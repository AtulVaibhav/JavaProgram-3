package com.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(10);
		set.add(3);
		set.add(15);
		
		System.out.println(set);
		
		set.add(null);
		System.out.println(set);
		
		set.add(10);
		System.out.println(set);
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		set.remove(10);
		System.out.println(set);
		
		

	}

}
