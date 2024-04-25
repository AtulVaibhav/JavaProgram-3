package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(21,45,23,19,56,78,12,12,21,45);
		
		//filter()
//		List<Integer> list1 = list.stream()
//				.filter(num->num%2==1)
//				.distinct()
//				.sorted()
//				.collect(Collectors.toList());
//	    System.out.println(list1);
		
		
		//map():even squared number
//		List<Integer> list2 = list.stream()
//		                      .filter(num->num%2==0)
//		                      .map(num->num*num)
//		                      .distinct()
//		                      .sorted()
//		                      //.limit(2)
//		                      .skip(1)
//		                      .collect(Collectors.toList());
//		System.out.println(list2);
		
		
		//forEach,collect,findFirst,findAny,allMatch,anyMatch,reduce
		
		List<String> names  = 
				Arrays.asList("Harsh","Aman","Ankit","Animesh","Harshith");
//		Optional<String> result = names.stream()
//		                       .filter(name->name.startsWith("An"))
//		                       .findFirst();
//		System.out.println(result.get());
		
//		names.stream()
//		    .filter(name->name.startsWith("An"))
//		    .forEach(name->System.out.println(name));
		
//		boolean result = names.stream()
//	                    .allMatch(name->name.startsWith("H"));
//		System.out.println(result);
		
		boolean result = names.stream()
                .anyMatch(name->name.startsWith("H"));
         System.out.println(result);
	    
	}

}
