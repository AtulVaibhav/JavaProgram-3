package com.learning.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_data")
public class Product {
  @Id
  @Column(name="p_id")
  private int productId;
  @Column(name="p_name")
  private String productName;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int productId, String productName) {
	super();
	this.productId = productId;
	this.productName = productName;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + "]";
}
  
  
}
