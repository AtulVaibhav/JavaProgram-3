package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		List<Integer> list  = Arrays.asList(1,2,3,4,5,6,7);
		//1.convert collectionType to stream
		Stream<Integer> stream = list.stream();
		
		//2.apply intermediate operations: filter,map,sort,distinct
		Stream<Integer> newList = stream.filter(num->num%2==0);
		
		//3.apply terminal operations: reduce,collect,findFirst,anyMatch
		newList.forEach(value->System.out.print(value+" "));
		
		
		System.out.println("_________________________________");
		
		Stream<Integer> stream2 = list.stream();
		Integer result = stream2.reduce(0,(a,b)->a+b);
		System.out.println(result);
		
		

	}

}
