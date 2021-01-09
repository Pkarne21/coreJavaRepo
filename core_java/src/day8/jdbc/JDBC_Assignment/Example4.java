package day8.jdbc.JDBC_Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Example4 {
	
	public static void main(String[] args) {
		
		Connection con = getMySqlDbConnection();
		String sql = "insert into student values (?,?,?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, 5);
			pst.setString(2, "Patrick");
			pst.setString(3, "");
			pst.setInt(4, 6);
			pst.setInt(5,26);
			
			int result = pst.executeUpdate(); // this method can be used for insert/update/delete queries
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
