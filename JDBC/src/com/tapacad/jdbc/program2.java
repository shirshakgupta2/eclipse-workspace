package com.tapacad.jdbc;
import java.sql.Connection;
//display alll the details of table
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class program2 {
	static Connection connection ;
	static Statement statement;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResultSet result=null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Root");
			System.out.println("conn estd");
			 statement = connection.createStatement();
			result = statement.executeQuery("Select * from employee.emp");
			
			
			while(result.next()) {
				System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+" "+result.getString(5)+" ");
			}
			ResultSet result1 = statement.executeQuery("Select * from employee.emp");
			while(result1.next()) {
				System.out.println(result1.getString("id")+" "+result1.getString("name")+" "+result1.getString("email")+" "+result1.getString("designation")+" "+result1.getString("salary")+" ");
			}
			System.out.println();
			System.out.println();
			statement = connection.createStatement();
			result = statement.executeQuery("SELECT * from emp where id=2");
			while(result.next()) {
				System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+" "+result.getString(5)+" ");
			}
			//System.out.println(result.next());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				statement.close();
				connection.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}

