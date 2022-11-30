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

public class program11 {
	private static FileInputStream inputStream ;
	private static Connection connection;
	private static Statement statement;
	private static ResultSet result ;
	private static String query="UPDATE `customer` set `balance`=`balance` + ? where `name`=?";
	private static String get_balance_query="SELECT `balance` from customer` where `name`=?`";
	private static String Select_query="SELECT * from `customer`";
	private static Scanner scan=new Scanner(System.in);
	private static PreparedStatement stmt2;
	private static ResultSet result1;
	private static PreparedStatement stmt3;
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
	
	static boolean transaction() {
		System.out.println("enter senders name");
		String sender=scan.next();
		System.out.println("enter receivers name");
		String receiver=scan.next();
		System.out.println("enter the amt");
		int amt=scan.nextInt();
		
		boolean checkBalance = checkBalance(sender, amt);
	
		if(checkBalance) {
			int x = updateBalance(sender,(-amt));
			int y = updateBalance(receiver,amt);
			boolean b = confirm(x,y);
			return b;
		}
		else {
			return false;
		}
	}
	private static boolean checkBalance(String sender, int amt) {
		// TODO Auto-generated method stub
		try {
			stmt3 = connection.prepareStatement(get_balance_query);
			stmt3.setString(1, sender);
			ResultSet set = stmt3.executeQuery();
			if(set.next()) {
				System.out.println(set.getString(1));
				int bal = set.getInt(1);
				return bal>=amt;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}

	private static boolean confirm(int x, int y) {
		// TODO Auto-generated method stub
		if(x==1&&y==1) {
			System.out.println("are you sure you want the transaction(yes/no)");
				return "yes".equalsIgnoreCase(scan.next());
		} 
		return false;
		
	}

	private static int updateBalance(String customer, int amt) {
		// TODO Auto-generated method stub
		try {
			 stmt2 = connection.prepareStatement(query);
			 stmt2.setInt(1, amt);
			 stmt2.setString(2, customer);
			 int i = stmt2.executeUpdate();
			 
			return i;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static void main(String[] args) {
		try {
			inputStream = new FileInputStream("C:\\Users\\HP\\eclipse-workspace"
					+ "\\JDBC\\src\\com\\tapacad\\utilite\\mysqlinfo.properties");
			Properties properties = new Properties();
			properties.load(inputStream);
			String url = properties.getProperty("url");
			
			String id = properties.getProperty("username");
			String password = properties.getProperty("password");
			
			//System.out.println(url);
			connection = DriverManager.getConnection(url,id, password);
			connection.setAutoCommit(false);
			Statement stmt = connection.createStatement();
			ResultSet result = stmt.executeQuery(Select_query);
			PrintTable.displayCustomer(result);
			if(transaction()) {
				connection.commit();
			}else
				connection.rollback();
			
			result = stmt.executeQuery(Select_query);
			PrintTable.displayCustomer(result);
			
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