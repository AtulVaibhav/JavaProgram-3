package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("Vivek", 23);
		map.put("Abhisekh", 21);
		map.put("John", 31);
		
		System.out.println(map);
		map.put("Vivek", 24);
		System.out.println(map);
		
		map.put(null, -30);
		System.out.println(map);
		
		map.put("Rohit",31 );
		System.out.println(map);
		
		//get
		System.out.println(map.get("Vivek"));
		
		//traversal
		for(Map.Entry<String, Integer> entry:map.entrySet()){
			//System.out.println(entry.getKey()+"---->"+entry.getValue());
			
			//System.out.println(entry.getKey());
		    System.out.println(entry.getValue());	
			
		}
		
		//System.out.println(map.containsKey("Rohit"));
          System.out.println(map.containsValue(31));
	}

}
