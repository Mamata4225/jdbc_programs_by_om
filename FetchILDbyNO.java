package com.xworkz.river.fetchingData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.river.constants.DBconstants;

public class FetchILDbyNO {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Class.forName(DBconstants.DRIVER);
		Connection conn = DriverManager.getConnection(DBconstants.URL, DBconstants.username, DBconstants.password);

		if (conn != null) {
			System.out.println("connected");
			Statement statement = conn.createStatement();

			String sql = "select R_ID,R_LENGTH,R_DAM_NO from river_details WHERE R_NAME='KAVERI' and R_ORIGIN='KODAGU'";
			ResultSet result = statement.executeQuery(sql);
			System.out.println(result);
			result.next();

			int R_ID = result.getInt(1);
			System.out.println("R_ID : " + R_ID);

			int R_DAM_NO = result.getInt(2);
			System.out.println("R_DAM_NO : " + R_DAM_NO);

			double R_LENGTH = result.getDouble(3);
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

