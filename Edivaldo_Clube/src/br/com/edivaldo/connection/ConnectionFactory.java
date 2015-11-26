package br.com.edivaldo.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}

	private static Connection connection;

	public static Connection getConnection() {
	 try {
		  connection = DriverManager.getConnection(
		     		"jdbc:mysql://localhost:3306/edivaldo?" +
				"user=root&password=root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	   
	   return connection;
	}

}
