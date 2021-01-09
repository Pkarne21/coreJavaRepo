package day8.jdbc.JDBC_Assignment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;


import utility.DBUtility;

public class Example7 {

	public static void main(String[] args) {
		
		Student student=new Student(7,"Aryan","HSC",2,17);
        Example7 example7=new Example7();
        example7.addStudent(student);
		
}
	public void addStudent(Student student){
		System.out.println("Student Details Adding!!! \n"+student);
		Connection con=DBUtility.getMySqlDbConnection();
		String sql= "insert into student values(?,?,?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, student.getRollnumber());
			pst.setString(2,student.getStudentname());
			pst.setString(3,student.getCourses());
			pst.setInt(4, student.getDurations());
			pst.setInt(5,student.getAge());
			int result = pst.executeUpdate();
			if(result==0) {
			System.out.println("Query Failed");
			}else {
			System.out.println("Success!!");
			}
			} catch (Exception e) {
			e.printStackTrace();
			}

	}
	
}





