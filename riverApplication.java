package com.xworkz.river;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class riverApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rever", "root", "root");
	
	if(conn!=null) {
		System.out.println("connected go for nextstep");
		Statement statement = conn.createStatement();
		String sqlQuery = "INSERT INTO river_details VALUES(1,'KAVERI',805,'KODAGU')";

		int totalRowsAffected = statement.executeUpdate(sqlQuery);
		System.out.println("totalRowsAffected:"+totalRowsAffected);
	}
	else {
		System.out.println("not connected");
	}
	}
}
