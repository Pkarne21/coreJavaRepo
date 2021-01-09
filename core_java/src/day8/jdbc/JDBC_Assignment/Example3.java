package day8.jdbc.JDBC_Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Example3 {

	public static void main(String[] args) {
		
		Connection con = getMySqlDbConnection();
		String sql = "insert into student values (10,'Pooja','IT',4,23)";
		try {
		Statement st = con.createStatement();
		int result = st.executeUpdate(sql); // this method can be used for insert/update/delete queries
		if(result==0) {
		System.out.println("Insertion Failed");
		}else {
		System.out.println("Data Inserted Successfully");
		}
		}catch(Exception e) {
		System.out.println("Exception Occured:"+e);
		}
	}
	
	public static Connection getMySqlDbConnection() {
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String dbUserName = "root";
		String dbPassword = "hp";
		Connection con = null;
		try {
		Class.forName(driverClassName);
		con = DriverManager.getConnection(url, dbUserName, dbPassword);

		 }
		catch(Exception e) {
		System.out.println("Exception while creating db connection:"+e);
		}
		return con;
		}
	}

