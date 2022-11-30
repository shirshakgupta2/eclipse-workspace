package com.tapacad.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Properties;
import java.util.Scanner;

public class PROGRAM12 {
	private static FileInputStream inputStream ;
	private static Connection connection;
	private static Statement statement;
	private static ResultSet result ;
	private static CallableStatement callStart;
	private static Scanner scan=new Scanner(System.in);
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
//			take data from the user and call the stored procedur count_emp
			
			callStart = connection.prepareCall("call count_emp(?,?)");
			
			System.out.println("\n\nenter the designation name:");
			callStart.setString(1, scan.next());
			callStart.registerOutParameter(2, Types.INTEGER);
			callStart.execute();
			int noOfEmp = callStart.getInt(2);
			System.out.println(noOfEmp);
			
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