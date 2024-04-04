package com.stringBuffer;

public class Problem1 {
    public static String getReverse(String str){
    	StringBuffer sb = new StringBuffer(str);
    	return sb.reverse().toString();
    	
    }
	public static void main(String[] args) {
		String str = "Java";
          System.out.println(getReverse(str));
	}

}
