package day8.jdbc;



import java.sql.*;

// Demo of JDBC Connection using PreparedStatement
public class StudentPrep {

 public static void main(String[] args) {
	String driverClassName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/java_training";
	String dbUserName = "root";
	String dbPassword = "hp";
	try {
	Class.forName(driverClassName);
	Connection con = DriverManager.getConnection(url, dbUserName, dbPassword);
	System.out.println("Connection: "+con);
	String sql = "select * from student";
	// Statement or PreparedStatement
	// First giving demo using Statement
	PreparedStatement pst = con.prepareStatement(sql);
	ResultSet rs = pst.executeQuery(); // for select queries, we use executeQury() method
	while(rs.next()) {
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
	System.out.println("**************************");
}

}catch(Exception e) {
System.out.println("Exception Occured:"+e);
}

}
 
}