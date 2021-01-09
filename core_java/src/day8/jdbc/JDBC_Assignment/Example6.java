package day8.jdbc.JDBC_Assignment;

import utility.DBUtility;

import java.sql.*;

import beans.Product;

public class Example6 {

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
			if(rs.next()) {
			String courseFromDb = rs.getString("course");
			if(course.equals(courseFromDb)) {
			System.out.println("Registered Successfully!!!");
			}else {
			System.out.println("Registeration Failed");
			}
			}
			else {
				System.out.println("Not a Registered Student!!");
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}

	}
		public void getStudentName(String studentName) {
            Connection con=DBUtility.getMySqlDbConnection();
            String sql="select * from student where student_name=?";
            try {
                PreparedStatement pst=con.prepareStatement(sql);
                pst.setString(1,studentName);
                ResultSet rs = pst.executeQuery();
                if(rs.next()) {
                   
                    String studentname=rs.getString("student_name");
                    int rollnumber=rs.getInt("roll_number");
                    String courses=rs.getString("course");
                    int durations=rs.getInt("duration");
                    int age=rs.getInt("age");
                   
                    System.out.println("RollNumber: "+rollnumber);
                    System.out.println("StudentName: "+studentname);
                    System.out.println("courses: "+courses);
                    System.out.println("Age: "+age);
                           
            }
                else {
                System.out.println("Student you mentioned does not exist");
            }
            }
                catch(Exception e) {
                System.out.println("Exception occured!");
            }
           
        }
		public void deleteStudent(int roll_number) 
			{
			 Connection con = DBUtility.getMySqlDbConnection();
	            String sql = "delete from student where roll_no=?";
	            try {
	            PreparedStatement pst = con.prepareStatement(sql);
	            pst.setInt(1, roll_number);
	            int result = pst.executeUpdate();
	            if(result==0) {
	            System.out.println("The Student with given roll no. does not exist");
	            }else {
	            System.out.println("Successfully deleted");
	            }
	            }catch(Exception e) {
	            System.out.println("Exception Occured:"+e);
	            }
			}
		public void updateProduct(Product product) {
			Connection con = DBUtility.getMySqlDbConnection();
			String sql = "update product set student_name=?, duration=? where roll_number=?";
			try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, Student.getStudentname());
			pst.setString(1, Student.getStudentname());
			pst.setInt(2, Student.getRollnumber());
			pst.setInt(3, product.getProductId());
			int result = pst.executeUpdate();
			if(result==0) {
			System.out.println("The product with given id does not exist");
			}else {
			System.out.println("Successfully Updated");
			}
			}catch(Exception e) {
			System.out.println("Exception Occured:"+e);
			}
			}
		
		
}
				
			
           
         


