package com.learning.Hibernate.HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
   public static void getProduct(Session session){
	   String hql = "from Product";
	   Query<Product> query = session.createQuery(hql);
	   List<Product> result = query.list();
	   for(Product p:result){
		   System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getProductPrice());
	   }
   }
   
   public static void getField(Session session){
	   String hql = "select p.productName from Product as p";
	   Query<String> query = session.createQuery(hql);
	   List<String> result = query.list();
	   System.out.println(result);
   }
   
   public static void getProductById(int pId,Session session){
	   String hql = "from Product as p where p.productId=:id";
	   Query<Product> query = session.createQuery(hql);
	   query.setInteger("id", pId);
	   List<Product> list = query.list();
	   System.out.println(list.get(0));
   }
   public static void sortedProduct(Session session){
	   String hql = "from Product order by productPrice desc";
	   Query<Product> query = session.createQuery(hql);
	   List<Product> result = query.list();
	   for(Product p:result){
		   System.out.println(p.getProductId()+" "+p.getProductName()+" "+p.getProductPrice());
	   }
	   
   }
   
   public static void updateProduct(int productId,double pPrice,Session session){
	   String hql = "update Product as p set p.productPrice=:price where p.productId=:id";
	   session.beginTransaction();
	   Query<Product> query = session.createQuery(hql);
	   query.setDouble("price", pPrice);
	   query.setInteger("id", productId);
	   int i = query.executeUpdate();
	   session.getTransaction().commit();
	   if(i>0){
		   System.out.println("Product price updated successfully");
	   }else{
		   System.out.println("Something went wrong");
	   }
   }
   
   public static void deleteProduct(int pId,Session session){
	   String hql = "delete from Product where productId=:id";
	   session.beginTransaction();
	   Query<Product> query = session.createQuery(hql);
	   
	   query.setInteger("id", pId);
	   int i = query.executeUpdate();
	   session.getTransaction().commit();
	   if(i>0){
		   System.out.println("Product deleted successfully");
	   }else{
		   System.out.println("Something went wrong");
	   }
	   
   }
	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure()
				.buildSessionFactory();
		
		Session session = factory.openSession();
		//getProduct(session);
		//getField(session);
		//getProductById(105, session);
        //sortedProduct(session);
		//updateProduct(105, 20000, session);
		deleteProduct(105 , session);
	}

}
