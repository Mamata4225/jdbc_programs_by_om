package com.xworkz.river.fetchingData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.river.constants.DBconstants;

public class FetchIdByName {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName(DBconstants.DRIVER);
		Connection conn = DriverManager.getConnection(DBconstants.URL, DBconstants.username, DBconstants.password);

		if (conn != null) {
			System.out.println("connected");
			Statement statement = conn.createStatement();

			String sql = "select R_ID from river_details WHERE R_NAME='KAVERI'";
			ResultSet result = statement.executeQuery(sql);
			System.out.println(result);
			result.next();

			int R_ID = result.getInt(1);
			System.out.println("R_ID : " + R_ID);

			conn.close();
			if (conn != null) {
				System.out.println("closed");
			} else {
				System.out.println("not closed");
			}
		} else {
			System.out.println("not connected");
		}
	}
}