package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test2 {

	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<>();
		for(int i=1;i<=5;i++){
			list.add(i);
		}
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			list.add(10);
		}

	}

}
