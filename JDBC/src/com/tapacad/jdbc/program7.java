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

public class program7 {
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
//			Insert multiple rows
			//we dont directly again and again write the excecuteUpdate instead we use batch file 
			String qurey1="insert into emp values(5, 'ram', 'ram@gmail.com', 'god' ,3800 )";;
			String qurey2="insert into emp values(6, 'ravan', 'ravan@gmail.com', 'enemy' ,38000)";
			String qurey3="insert into emp values(7, 'sita', 'sita@gmail.com', 'wife' ,38050 )";
			statement.addBatch(qurey1);
			statement.addBatch(qurey2);
			statement.addBatch(qurey3);//these just add the querys inside the batch statement
			statement.executeBatch();
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
