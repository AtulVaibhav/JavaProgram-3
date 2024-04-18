package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
         
		//check list is empty or not:
		System.out.println(list.isEmpty());
		
		//size()
		System.out.println(list.size());
		
		
		//add objects
		list.add(3);
		list.add(10);
		list.add(1);
		list.add(15);
		
		System.out.println(list);
		//adding duplicates
		list.add(3);
		System.out.println(list);
		
		//adding null
		list.add(null);
		System.out.println(list);
		
		List<Integer> list2 = new ArrayList<>();
		for(int i=11;i<=15;i++){
			list2.add(i);
		}
		System.out.println(list2);
		//addAll
		list.addAll(list2);
		
		System.out.println(list);
		
		//indexing:
		System.out.println(list.get(1));
		
		
		//traversal
		  //1.using for loop
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+"  ");
		}
		System.out.println();
		
		//enhanced for loop
		for(Integer obj:list){
			System.out.print(obj+" ");
		}
		System.out.println();
		
		//forEach:
		list.stream().forEach(x->System.out.print(x+" "));
		System.out.println();
		
		//using iterator
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		
		//update
		list.set(5, 1000);
		
		System.out.println(list);
		
		//delete
		list.remove(0);
		System.out.println(list);
		
		
		//contains
		System.out.println(list.contains(10));
		
		
		
		
	}

}
