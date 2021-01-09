package day8.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
//insert data using PreparedStatement

public class Example4{
	public static void main(String[] args) {
		Connection con=getMySqlDbConnection();
		String sql="insert into login values(?,?)";
		
		try
		{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, "user");
			pst.setString(2, "456");
			int result = pst.executeUpdate(); 
			if(result==0)
			{
				System.out.println("Insertion Failed");
			}
			else
				System.out.println("Data inserted successfully");
			}catch(Exception e)
		{
				System.out.println("Exception occured"+e);
		}
	}


public static Connection getMySqlDbConnection()
{
	String driverClassName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/java_training";
	String dbUserName = "root";
	String dbPassword ="hp";
	Connection con=null;
	try {
		Class.forName(driverClassName);
		 con = DriverManager.getConnection(url, dbUserName, dbPassword);
	}catch(Exception e)
	{
		System.out.println("Exception occured"+e);
	}
	return con;
}

}