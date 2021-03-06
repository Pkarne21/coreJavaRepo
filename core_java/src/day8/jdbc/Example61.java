package day8.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import utility.DBUtility;

public class Example61 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	String uname , pass;
	System.out.println("Enter Username : ");
	uname = sc.next();
	System.out.println("Enter Password : ");
	pass = sc.next();
	Connection connect = DBUtility.getMySqlDbConnection();
	String sqlQuery = "select * from login where Username = ?";

	 try {
	PreparedStatement pst = connect.prepareStatement(sqlQuery);
	pst.setString(1, uname);
	ResultSet rs = pst.executeQuery();
	if (rs.next()) {
	String username = rs.getString("Username");
	String password = rs.getString("Password");
	if ((uname.equals(username)) && (pass.equals(password))) {
	System.out.println("Success Login !");
	} else {
	System.out.println("Failed Login !");
	}

	 } else {
	System.out.println("Username not found !");
	}

	 } catch (Exception e) {
	System.out.println("Error occured : " + e);
	}
	}
	
}
