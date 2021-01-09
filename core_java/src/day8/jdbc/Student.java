package day8.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class Student {
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
			String sql="Select * from student ";
			//Statement on preparedStatement
			//First giving demo using Statement
			java.sql.Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			
			{
				String rollNumber=rs.getString("roll_number");
				String studentName=rs.getString("student_name");
				String Course=rs.getString("course");
				String Age=rs.getString("age");
				String Duration=rs.getString("duration");
				System.out.println("RollNumber:"+rollNumber);
				System.out.println("StudentName:"+studentName);
				System.out.println("Course:"+Course);
				System.out.println("Age:"+Age);
				System.out.println("Duration:"+Duration);
				System.out.println("*****************");
			}
			
		}catch(Exception e)
		{
			System.out.println("Exception occured"+e);
		}
		
		}
	
}

