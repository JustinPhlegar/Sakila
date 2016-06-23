package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database 
{
	public Connection getConnection() throws Exception
	{
		try
		{
			String connectionURL = "jdbc:mysql://localhost:3306/sakila";
			Connection connection = null;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connectionURL, "root", "toor");
			return connection;
		}
		catch (SQLException e)
		{
			throw e; 
		}
		catch (Exception e)
		{
			throw e; 
		}
	}
}