package com.Inheritance;


class Super{
	int a = 20;
}

class Sub extends Super{
	int a =30;
	public void show(){
		int a = 40;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
public class Test {

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.show();

	}

}
