package com.learning;

public class Operators {
    public void arithmeticOperator(){
    	int a = 10;
    	int b=5;
    	System.out.println(a+b);
    	System.out.println(a-b);
    	System.out.println(a*b);
    	System.out.println(a/b);
    	System.out.println(a%b);
    }
    
    public void unaryOperator(){
    	int a=10;
    	System.out.println(-a);
    	
    	int b=10;
    	int c = b++;
    	System.out.println(b+" "+c);
    	
    	
    	int x = 20;
    	int y = ++x;
    	System.out.println(x+" "+y);
    	
    	int z = 33;
    	System.out.println(~z);
    }
    
    public void relationalOperators(){
    	//boolean
    	
    	int x=10;
    	int y=20;
    	
    	System.out.println(x>y);
    	System.out.println(x>=y);
    	
    	System.out.println(x<y);
    	System.out.println(x<=y);
    	
    	System.out.println(x==y);
    	System.out.println(x!=y);
    }
    
    public void logicalOperator(){
    	int x=12;
    	int y=20;
    	
    	System.out.println(!((x>y)&&(y<x)));
    }
    
    public void shiftOperator(){
    	int a=10;
    	System.out.println(a<<4);
    	int b=20;
    	System.out.println(b>>1);
    }
    
    public void bitWiseOperator(){
    	int a=10;
    	int b=5;
    	System.out.println(a&b);
    	System.out.println(a|b);
    	System.out.println(a^b);
    }
    
    public void instanceOfOperator(){
    	String str="Hello";
    	System.out.println(str instanceof  String);
    }
    
	public static void main(String[] args) {
		Operators obj = new Operators();
		obj.arithmeticOperator();
		obj.unaryOperator();
        obj.relationalOperators();
        obj.logicalOperator();
        obj.shiftOperator();
        obj.bitWiseOperator();
        obj.instanceOfOperator();
	}

}
