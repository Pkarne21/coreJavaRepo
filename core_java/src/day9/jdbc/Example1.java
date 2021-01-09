package day9.jdbc;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.Product;
import day8.jdbc.Example7;
import day9.jdbc.ProductDao;
import utility.DBUtility;

public class Example1 {
	public static void main(String[] args) {
		Product product1=new Product(1,"Laptop", 100);
		//Example7 example7=new Example7();
		//Product product2=new Product(2,"Mobile", 90);
		//Example1 example1=new Example1();
		ProductDao example1=new ProductDao();
		//example1.getProduct(2);
		//example1.deleteProduct(101);

		//example7.addProduct(product1);
		//example1.addProduct(prod);
		Product product=new Product(2,"Dining",80);
		example1.updateProduct(product);
	}

	
}	
