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

public class program3 {
	private static FileInputStream inputStream ;
	private static Connection connection;
	private static Statement statement;
	private static ResultSet result ;
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
			inputStream = new FileInputStream("C:\\Users\\HP\\eclipse-workspace"
					+ "\\JDBC\\src\\com\\tapacad\\utilite\\mysqlinfo.properties");
			Properties properties = new Properties();
			properties.load(inputStream);
			String url = properties.getProperty("url");
			String id = properties.getProperty("username");
			String password = properties.getProperty("password");
			
			System.out.println(url);
			connection = DriverManager.getConnection(url,id, password);
			// connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Root");
				
			//System.out.println("conn estd");
			statement = connection.createStatement();
			result = statement.executeQuery("SELECT * from emp where id=2");
			while(result.next()) {
				System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+" "+result.getString(5)+" ");
			}
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
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
