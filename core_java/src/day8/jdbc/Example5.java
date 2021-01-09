package day8.jdbc;

import utility.DBUtility;
import java.sql.*;

public class Example5 {

 public static void main(String[] args) {
	String userName = "user";
	String password = "45";
	Connection con = DBUtility.getMySqlDbConnection();
	String sql = "select * from login where user_name=?";
	try {
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, userName);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			String passwordFromDb = rs.getString("password");
			if(password.equals(passwordFromDb)) {
				System.out.println("Login Successful");
			}else {
	System.out.println("Login Failed");
	}
	}
	} catch (SQLException e) {
	e.printStackTrace();
}

}
}