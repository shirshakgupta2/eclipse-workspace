package com.tapacad.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class program9 {
	private static FileInputStream inputStream ;
	private static Connection connection;
	private static Statement statement;
	private static ResultSet result ;
	private static final Scanner scan=new Scanner(System.in) ;
	//private static;
	final static String query="insert into emp (id,name,email,designation,salary) values(?, ?, ?,?,?)";
	
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
			inputStream = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\JDBC\\src\\com\\tapacad\\utilite\\mysqlinfo.properties");
			Properties properties = new Properties();
			properties.load(inputStream);
			String url = properties.getProperty("url");
			String id = properties.getProperty("username");
			String pass = properties.getProperty("password");
			connection = DriverManager.getConnection(url,id,pass);
			//System.out.println(url);
			
			statement = connection.createStatement();
			 result = statement.executeQuery("SELECT * from `emp`");
			PrintTable.displayEmployee(result);
//			Insert detail rows by  the input from user
			
			PreparedStatement stmt = connection.prepareStatement(query);
			System.out.println("enter id,name,designation,salary with sepreated ccomma's");
			String s=scan.nextLine();
			String[] ar = s.split(",");
			do {
				stmt.setString(1, ar[0]);
				stmt.setString(2, ar[1]);
				stmt.setString(3, ar[2]);
				stmt.setString(4, ar[3]);
				stmt.setString(5, ar[4]);
				stmt.addBatch();
				System.out.println("Do you want to enter more data:(yes/no) ");
				
			} while (scan.next().equalsIgnoreCase("yes"));
			//stmt.executeUpdate();// if we do this the last data enter will be stored only
			stmt.executeBatch();
			System.out.println("--------------------------------------");
			result = statement.executeQuery("SELECT * from emp");
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
