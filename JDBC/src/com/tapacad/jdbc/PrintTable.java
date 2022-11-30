package com.tapacad.jdbc;


import java.sql.ResultSet;
import java.sql.SQLException;
class PrintTable {
	
	static void displayEmployee(ResultSet result) throws SQLException {
		while(result.next()) {
//			System.out.println(result.getString(1)+" "+result.getString(2)+
//					" "+result.getString(3)+" "+result.getString(4)+" "+result.getString(5)+" ");
			System.out.printf("%-3s %-10s %-15s %-25s %-30s\n",  
					result.getString(1),result.getString(2),
					result.getString(3),result.getString(4),result.getString(5));
		}
	}
	
	static void displayStudent(ResultSet result) throws SQLException {
		while (result.next()) {
			System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+" "
	+result.getString(5)+" "+result.getString(6)
	+" "+result.getString(7)+" "+result.getString(8)+" "+result.getString(9)+" "
	+result.getString(10)+" ");
			
		}
	}
	
	static void displayCustomer(ResultSet result) throws SQLException {
		while(result.next()) {
//			System.out.println(result.getString(1)+" "+result.getString(2)+
//					" "+result.getString(3));
			System.out.printf("%-1s %-10s %-2s\n",result.getString(1),result.getString(2),result.getString(3));
		}
	}
}