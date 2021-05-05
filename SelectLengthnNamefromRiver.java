package com.xworkz.river.fetchDataBySelect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.river.constants.DBconstants;

public class SelectLengthnNamefromRiver {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName(DBconstants.DRIVER);
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(DBconstants.URL, DBconstants.username, DBconstants.password);
			if (connection != null) {
				System.out.println("open");
			} else {
				System.out.println("not open");
			}
			Statement statement = connection.createStatement();
			
			String sql = "select R_LENGTH, R_NAME FROM river_details";

			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				
				double R_LENGTH = result.getDouble(1);
				System.out.println("R_LENGTH : " + R_LENGTH);
				
				String R_NAME = result.getString(2);
				System.out.println("R_NAME : " + R_NAME);

			}
		}

		finally {
			connection.close();
			if (connection != null) {
				System.out.println("closed");
			} else {
				System.out.println("not closed");
			}

		}
	}
}
