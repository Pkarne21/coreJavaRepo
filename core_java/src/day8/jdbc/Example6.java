package day8.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utility.DBUtility;

public class Example6 {
	// we will give a message that "User Id not present in db" in case user_name not found in db
	public static void main(String[] args) {
	String userName = "admin";
	String password = "123";
	Connection con = DBUtility.getMySqlDbConnection();
	String sql = "select * from login where user_name=?";
	try {
	PreparedStatement pst = con.prepareStatement(sql);
	pst.setString(1, userName);
	ResultSet rs = pst.executeQuery();
	if(rs.next()) {
	String passwordFromDb = rs.getString("password");
	if(password.equals(passwordFromDb)) {
	System.out.println("Login Successful");
	}else {
	System.out.println("Login Failed");
	}
	}else {
	System.out.println("User Id not present in db");
	}
	} catch (SQLException e) {
	e.printStackTrace();
	}

	}
	

}
