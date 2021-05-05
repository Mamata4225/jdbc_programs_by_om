package com.xworkz.river;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RiverUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String URL = "jdbc:mysql://localhost:3306/xworkz";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(URL, username, password);
		if (connection != null) {
			System.out.println("connected");
			Statement statement = connection.createStatement();

			String sqlQuery = "UPDATE river_details SET R_DAM_NO=5 WHERE R_NAME='KRISHNA'";
			int totalRowsUpdated = statement.executeUpdate(sqlQuery);
			System.out.println("totalRowsUpdated:" + totalRowsUpdated);
			connection.close();
			if (connection != null) {
				System.out.println("connection closed");
			} else {
				System.out.println("not closed");
			}
		} else {
			System.out.println("not connected");
		}
	}

}
