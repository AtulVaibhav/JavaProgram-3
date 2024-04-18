package com.collection;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
	ArrayList<? super Number> list = new ArrayList<>();
	list.add(12);
	list.add(12.5f);
	//list.add("Hello");

	}

}
