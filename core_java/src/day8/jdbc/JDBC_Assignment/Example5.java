package day8.jdbc.JDBC_Assignment;


import utility.DBUtility;

import java.sql.*;

public class Example5 {

	// implement jdbc code to check if login is success or failed
		public static void main(String[] args) {
			int roll_number=4;
			String student_name ="Abhi" ;
			String course="BCom";
			int duration=3;
			int age=20;		
			Connection con = DBUtility.getMySqlDbConnection();
			String sql = "select * from student where roll_number=?";
			try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, roll_number);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
			String courseFromDb = rs.getString("course");
			if(course.equals(courseFromDb)) {
			System.out.println("Registered Successfully!!!");
			}else {
			System.out.println("Registeration Failed");
			}
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}

	}
}
