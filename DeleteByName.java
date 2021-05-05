package com.xworkz.river.riverassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.river.constants.DBconstants;

public class DeleteByName {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {


		Class.forName(DBconstants.DRIVER);

		Connection connection = DriverManager.getConnection(DBconstants.URL, DBconstants.username, DBconstants.password);
		if (connection != null) {
			System.out.println("connected");
			Statement statement = connection.createStatement();

			String sqlQuery = "DELETE from river_details where R_NAME='KAVERI'";

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
