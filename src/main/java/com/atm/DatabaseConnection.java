package com.atm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	static
	{
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}

	public Connection createConnection()
	{
		String url ="jdbc:postgresql://localhost:5432/atm_management";
		String dbuser ="postgres";
		String pass="root";
		Connection connection = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection =DriverManager.getConnection(url, dbuser, pass);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
}
