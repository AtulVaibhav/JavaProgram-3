package com.learning;

class Book{
	int pageNumber;
	String bookName;
	
	Book(int pageNumber,String bookName){
		this.pageNumber = pageNumber;
		this.bookName = bookName;
	}
	
	public void show(){
		System.out.println(pageNumber+" "+bookName);
	}
}
public class This_I {

	public static void main(String[] args) {
		Book b1 = new Book(1,"Java");
		b1.show();

	}

}
