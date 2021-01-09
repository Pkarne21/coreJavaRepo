package day8.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Example1 {
	public static void main(String[] args) {
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String dbUserName = "root";
		String dbPassword = "hp";
		try
		{
			Class.forName(driverClassName);
			Connection con = DriverManager.getConnection(url, dbUserName, dbPassword);
			System.out.println("Connection: "+con);
			String sql="Select * from login ";
			//Statement on preparedStatement
			//First giving demo using Statement
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				String userName=rs.getString("user_name");
				String password=rs.getString("password");
				System.out.println("username:"+userName);
				System.out.println("password:"+password);
				System.out.println("*****************");
			}
			
		}catch(Exception e)
		{
			System.out.println("Exception occured"+e);
		}
		
		}
	

}
