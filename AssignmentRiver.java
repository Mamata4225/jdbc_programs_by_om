package com.xworkz.river.riverassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.river.constants.DBconstants;

public class AssignmentRiver {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	
	Class.forName(DBconstants.DRIVER);
	
Connection connection = DriverManager.getConnection(DBconstants.URL, DBconstants.username, DBconstants.password);
if(connection!=null) {
	System.out.println("connected");
	Statement statement = connection.createStatement();

//	String sqlQuery = "UPDATE river_details SET R_ORIGIN='KODAGU' WHERE R_NAME = 'GANGA'";
	
//	String sqlQuery = "UPDATE river_details SET R_LENGTH='1800', R_DAM_NO='48' WHERE R_NAME='GANGA' AND R_ID='2'";
    
//	String sqlQuery =  "UPDATE river_details SET R_POLLUTTED='1' WHERE R_ID='1'";
	
//	String sqlQuery = "UPDATE river_details SET R_POLLUTTED='0', R_ORIGIN='AMARKANTAK', R_DAM_NO='155' WHERE R_NAME='KAVERI'";
	
//	String sqlQuery ="DELETE from river_details where R_ID='2'";

	String sqlQuery ="DELETE from river_details where R_NAME='NARMADA'";

	int totalRowsUpdated = statement.executeUpdate(sqlQuery);
	System.out.println("totalRowsUpdated:" + totalRowsUpdated);
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
