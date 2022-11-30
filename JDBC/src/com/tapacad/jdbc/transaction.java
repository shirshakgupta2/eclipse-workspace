package com.tapacad.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class transaction {

	private static FileInputStream fileInputStream;
	private static Connection conn;
	private static Scanner scan=new Scanner(System.in);
	private static Statement select_stmt;
	private static ResultSet select_result; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			fileInputStream = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\JDBC\\src\\com\\tapacad\\utilite\\mysqlinfo.properties");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Properties properties = new Properties();
			properties.load(fileInputStream);
			String url = properties.getProperty("url1");
			String id = properties.getProperty("username");
			String pass = properties.getProperty("password");
			
			conn = DriverManager.getConnection(url,id,pass);
			//login Module
			
			select_stmt = conn.createStatement();
			select_result = select_stmt.executeQuery("Select * from account");
			
			
			while(select_result.next()) {
				System.out.println(select_result.getString(1)+" "+select_result.getString(2)+" "+select_result.getString(3)+" "+select_result.getString(4)+" ");
				
			}
			System.out.println("\n\n");
			System.out.println("<----welcom to tap bank---->");
			System.out.println("enter the acc num:");
			int acc_num=scan.nextInt();
			System.out.println("enter the pin:");
			int pin = scan.nextInt();
			PreparedStatement pstmt = conn.prepareStatement("select * from account where acc_num=? and pin=?");
			pstmt.setInt(1, acc_num);
			pstmt.setInt(2,pin);
			ResultSet result = pstmt.executeQuery();
			result.next();
			System.out.println("welcome "+result.getString(2));
			System.out.println("Available balance is "+result.getString(4));
			
			//transfer module
			System.out.println("<------Transfer details------>");
			System.out.println("enter the beneficiary acc num");
			
			int bacc_num = scan.nextInt();
			System.out.println("enter the transfer amt");
			
			int amt = scan.nextInt();
			
			conn.setAutoCommit(false);
			Savepoint savepoint = conn.setSavepoint();
			
			PreparedStatement pstmt2 = conn.prepareStatement("update account set balance=balance-? where acc_num=?");
			pstmt2.setInt(1, amt);
			pstmt2.setInt(2, acc_num);
			pstmt2.executeUpdate();
			
			System.out.println("<-----Incoming credit request----->");
			System.out.println(result.getString(2)+" with account number "+acc_num+" wants to transfer "+amt+"to you");
			System.out.println("press Y to receive or N to reject");
			if(scan.next().equalsIgnoreCase("Y")) {
				PreparedStatement pstmt3 = conn.prepareStatement("update account set balance=balance+? where acc_num=?");
				pstmt3.setInt(1, amt);
				pstmt3.setInt(2, bacc_num);
				pstmt3.executeUpdate();
				
				PreparedStatement pstmt4 = conn.prepareStatement("Select *from account where acc_num=? OR acc_num=?");
				pstmt4.setInt(1, acc_num);
				pstmt4.setInt(2,bacc_num);
				ResultSet result1 = pstmt4.executeQuery();
				result1.next();
				System.out.println(result1.getString(2)+" balance is:"+result1.getString(4));
				result1.next();
				System.out.println(result1.getString(2)+" balance is:"+result1.getString(4));
			}
			else {
				conn.rollback(savepoint);
				PreparedStatement pstmt4 = conn.prepareStatement("Select *from account where acc_num=? OR acc_num=?");
				pstmt4.setInt(1, acc_num);
				pstmt4.setInt(2,bacc_num);
				ResultSet result1 = pstmt4.executeQuery();
				result1.next();
				System.out.println(result1.getString(2)+" balance is:"+result1.getString(4));
				result1.next();
				System.out.println(result1.getString(2)+" balance is:"+result1.getString(4));
				
				
			}
			conn.commit();
			System.out.println("\n\n");
			select_stmt = conn.createStatement();
			select_result = select_stmt.executeQuery("Select * from account");
			
			
			while(select_result.next()) {
				System.out.println(select_result.getString(1)+" "+select_result.getString(2)+" "+select_result.getString(3)+" "+select_result.getString(4)+" ");
				
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
