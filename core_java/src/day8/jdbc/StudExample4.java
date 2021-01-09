package day8.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudExample4 {
	public static void main(String[] args) {
		Connection con=getMySqlDbConnection();
		String sql="insert into student values(4,'Abhi','BCom',3,20)";
		try
		{
			Statement st=con.createStatement();
			int result=st.executeUpdate(sql);
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
