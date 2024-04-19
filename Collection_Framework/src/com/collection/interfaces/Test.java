package com.collection.interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product implements Comparable<Product>{
	private int productId;
	private String productName;
	private int productRating;
	private int productPrice;
	public Product(int productId, String productName, int productRating, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productRating = productRating;
		this.productPrice = productPrice;
	}
	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductRating() {
		return productRating;
	}

	public void setProductRating(int productRating) {
		this.productRating = productRating;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productRating=" + productRating
				+ ", productPrice=" + productPrice + "]";
	}
	@Override
	public int compareTo(Product p1) {
		// TODO Auto-generated method stub
		return p1.productRating - this.productRating;
	}
	
	

}

class SortByName implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getProductName().compareTo(o2.getProductName());
	}
	
}

class SortByPrice implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		
		return o2.getProductPrice() - o1.getProductPrice();
	}
	
}




public class Test {

	public static void main(String[] args) {
		Product p1 = new Product(103,"Laptops",4,78000);
		Product p2 = new Product(101,"Mobiles",2,58000);
		Product p3 = new Product(105,"WM",5,98000);
		Product p4 = new Product(102,"TV",3,48000);
		Product p5 = new Product(104,"Tablets",1,38000);
		
		List<Product> list = Arrays.asList(p1,p2,p3,p4,p5);
		//Collections.sort(list);
		
//		System.out.println("Sorting products based on name");
//		Collections.sort(list,new SortByName());
		
		System.out.println("Sorting products based on price");
	     Collections.sort(list,new SortByPrice());	
		for(Product p:list){
			System.out.println(p);
		}
		
		
		
	}

}
