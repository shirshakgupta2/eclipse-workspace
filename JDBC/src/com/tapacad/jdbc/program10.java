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

public class program10 {
	private static FileInputStream inputStream ;
	private static Connection connection;
	private static Statement statement;
	private static ResultSet result ;
	private static final Scanner scan=new Scanner(System.in) ;
	//private static;
	final static String adddetailquery="insert into student (name,email,phone,degree,branch,YOP,grd_percentage,12th,10th) values(?,?,?,?,?,?,?,?,?)";
//	final static String detailfromname=;
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
	
	static void addStudent() throws SQLException{
		PreparedStatement stmt = connection.prepareStatement(adddetailquery);
		do {
			System.out.println("name:");
			stmt.setString(1, scan.next());
			System.out.println("email:");
			stmt.setString(2, scan.next());
			System.out.println("phone:");
			stmt.setString(3, scan.next());
			System.out.println("degree:");
			stmt.setString(4, scan.next());
			System.out.println("branch:");
			stmt.setString(5, scan.next());
			System.out.println("YOP:");
			stmt.setString(6, scan.next());
			System.out.println("degree_percentage:");
			stmt.setString(7, scan.next());
			System.out.println("12th percentage:");
			stmt.setString(8, scan.next());
			System.out.println("10th percentage:");
			stmt.setString(9, scan.next());
			stmt.addBatch();
			System.out.println("if you want enter more details type(yes/no)");
		}while(scan.next().equalsIgnoreCase("yes"));
		stmt.executeBatch();
	}
	static void RetriveData(String name) throws SQLException {
		Statement stat = connection.createStatement();
		ResultSet res = stat.executeQuery("SELECT * from student where name='"+name+"'");
		PrintTable.displayStudent(res);
	}
	static void RetriveData(int id) throws SQLException {
		Statement stat = connection.createStatement();
		ResultSet res = stat.executeQuery("SELECT * from student where id="+id);
		PrintTable.displayStudent(res);
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
			result = statement.executeQuery("SELECT * from `student`");
			PrintTable.displayStudent(result);
//			System.out.println("please enter the details which you want to insert in the table");
//			addStudent();
			System.out.println("enter the NAME/ID of student whoes detail you want to search");
			
			if(scan.hasNextInt()) {
				RetriveData(scan.nextInt());
				
			}
			else if(scan.hasNext()) {
				RetriveData(scan.next());
			}
			else {
				System.out.println("no data");
			}
				

			
			
			
			
			System.out.println("---------------");
			
			result = statement.executeQuery("SELECT * from `student`");
			PrintTable.displayStudent(result);
			
			
			
			
			
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

