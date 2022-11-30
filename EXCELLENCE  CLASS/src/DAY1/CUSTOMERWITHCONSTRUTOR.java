package DAY1;

import java.util.Scanner;

class customer1{
	public String customerName;
	public String customerEmail;
	public String customerType;
	public String customerAddress;
	
	public customer1() {
		
	}
	
	public customer1(String customerName, String customerEmail, String customerType, String customerAddress) {
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerType = customerType;
		this.customerAddress = customerAddress;
	}

	void displayDetails() {
		System.out.println("Name: "+this.customerName);
		System.out.println("Name: "+this.customerEmail);
		System.out.println("Name: "+this.customerType);
		System.out.println("Name: "+this.customerAddress);
		
	}
}
public class CUSTOMERWITHCONSTRUTOR {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter The name");
		String customerName=scan.next();
		System.out.println("Enter The email");
		String customerEmail=scan.next();
		System.out.println("Enter The type");
		String customerType=scan.next();
		System.out.println("Enter The location");
		String customerAddress=scan.next();
		
		
		customer1 customer1 = new customer1(customerName,customerEmail,customerType,customerAddress);
		
		
	}

}
