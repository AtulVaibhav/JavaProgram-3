package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		//print average of number
		double result = list.stream()
				       .mapToInt(x->x)
				       .average()
				       .getAsDouble();
		System.out.println(result);
		
		
		List<Integer> list2 = Arrays.asList(1,2,12,22,32,222,234,132,213);
		//print all numbers starting with 2
		
		List<Integer> prefix2 = list2.stream()
		                        .map(x->String.valueOf(x))
		                        .filter(x->x.startsWith("2"))
		                        .map(x->Integer.parseInt(x))
		                        .collect(Collectors.toList());
		System.out.println(prefix2);
		

	}

}
