package com.xworkz.river;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.river.constants.DBconstants;

public class FetchByRiverName {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		
		Class.forName(DBconstants.DRIVER);
		Connection conn = DriverManager.getConnection(DBconstants.URL, DBconstants.username, DBconstants.password);
		if (conn != null) {
			System.out.println("connected");
			Statement statement = conn.createStatement();

			String sql = "select * from river_details WHERE R_NAME='KAVERI'";
			ResultSet result = statement.executeQuery(sql);
			System.out.println(result);
			result.next();

			int R_ID = result.getInt(1);
			System.out.println("R_ID : " + R_ID);

			String R_NAME = result.getString(2);
			System.out.println("R_NAME : " + R_NAME);

			String R_ORIGIN = result.getString(3);
			System.out.println("R_ORIGIN : " + R_ORIGIN);

			boolean R_POLLUTTED = result.getBoolean(4);
			System.out.println("R_POLLUTTED : " + R_POLLUTTED);

			int R_DAM_NO = result.getInt(5);
			System.out.println("R_DAM_NO : " + R_DAM_NO);

			double R_LENGTH = result.getDouble(6);
			System.out.println("R_LENGTH : " + R_LENGTH);

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
