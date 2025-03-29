package com.pavan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	
	private static final String URL="jdbc:mysql:///jdbc";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Pav@0211";
	
	private static Connection connection = null;
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		if(connection == null)
		{
			connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
		}
		
		return connection;
	}

}
