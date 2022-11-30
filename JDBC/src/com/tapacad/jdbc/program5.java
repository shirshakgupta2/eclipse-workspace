package com.tapacad.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class program5 {
	private static FileInputStream inputStream ;
	private static Connection connection;
	private static Statement statement;
	private static ResultSet result ;
	final static String query="delete from `emp` where `id`=10";
	//private static;
	static void close() throws SQLException, IOException {
		if (inputStream !=null) {
			
			inputStream.close();
		}
		if (connection != null) {
			connection.close();
			
		}
		if (statement !=null) {
			statement.close();
		}
		if (result != null) {
			result.close();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 inputStream = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\JDBC\\"
					+ "src\\com\\tapacad\\utilite\\mysqlinfo.properties");
			Properties properties = new Properties();
			properties.load(inputStream);
			
			String url = properties.getProperty("url");
			String id = properties.getProperty("username");
			String password = properties.getProperty("password");
			
			 connection = DriverManager.getConnection(url,id,password);
			 statement = connection.createStatement();
			
			  result = statement.executeQuery("Select * from emp");//result is like a pointer to the table
			 
			 PrintTable.displayEmployee(result);//while dispalying result pointer points to the end after performing select query 
			 System.out.println("-----------");
			 statement.executeUpdate(query);
			 result = statement.executeQuery("Select * from emp"); // since it point to the end we create another pointer to go to the top
			 PrintTable.displayEmployee(result);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				close();
			} catch (SQLException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
