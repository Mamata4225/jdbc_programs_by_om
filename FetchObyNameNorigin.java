package com.xworkz.river.fetchingData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.river.constants.DBconstants;

public class FetchObyNameNorigin {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName(DBconstants.DRIVER);
		Connection conn = DriverManager.getConnection(DBconstants.URL, DBconstants.username, DBconstants.password);

		if (conn != null) {
			System.out.println("connected");
			Statement statement = conn.createStatement();

			String sql = "select R_ORIGIN from  river_details WHERE R_NAME='KAVERI' and R_ORIGIN='KODAGU'";
			ResultSet result = statement.executeQuery(sql);
			System.out.println(result);
			result.next();


			String R_ORIGIN = result.getString(1);
			System.out.println("R_ORIGIN : " + R_ORIGIN);

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

