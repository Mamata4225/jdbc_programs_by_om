package com.xworkz.river;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RiverApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz", "root", "root");
		if(connection!=null) {
			System.out.println("connected");
			Statement statement = connection.createStatement();
			String sqlQuery =  "INSERT INTO river_details VALUES(5,'NARMADA','AMARKANTAK',0,30,1312)";
		int totalRowsAffected =statement.executeUpdate(sqlQuery);
		System.out.println("totalRowsAffected:"+totalRowsAffected);
		connection.close();
		if(connection!=null){
		System.out.println("connection closed");
		}else {
			System.out.println("not closed");
		}
		}
		else {
			System.out.println("not connected");
		}
		
	}

}

