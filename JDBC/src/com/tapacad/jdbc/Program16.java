package com.tapacad.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Properties;
import java.util.Scanner;

public class Program16 {
	private static FileInputStream inputStream ;
	private static Connection connection;
	private static Statement statement;
	private static ResultSet result ;
	private static CallableStatement callStart;
	private static Scanner scan=new Scanner(System.in);
	private static ResultSet set;
	private static String qurey="UPDATE emp set intro=? where id=?";
	private static PreparedStatement stmt;
	private static FileReader fileread;
	
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
			statement = connection.createStatement();
			
			result = statement.executeQuery("SELECT * from `emp`");
			PrintTable.displayEmployee(result);

			ResultSetMetaData metaData = result.getMetaData();
			System.out.println(metaData.getColumnCount());
		
			for (int i = 1; i <= metaData.getColumnCount(); i++) {
				System.out.println(metaData.getColumnName(i)+"  "+metaData.getColumnType(i)+"  "+metaData.getColumnTypeName(i));
			}
//			put a picture in the table where id is 3

			fileread = new FileReader("C:\\Users\\HP\\eclipse-workspace\\JDBC\\src\\com\\tapacad\\utilite\\intro1.txt");
			stmt = connection.prepareStatement(qurey);
			
			stmt.setCharacterStream(1, fileread);
			stmt.setInt(2, scan.nextInt());
			
			stmt.executeUpdate();
			
			
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
