package com.sathya.servlet;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {
	public static Connection createConnection()
	{
		Connection connection=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","geetha","geetha");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return connection;
	}


}