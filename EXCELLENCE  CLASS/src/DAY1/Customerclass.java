package DAY1;

import java.util.Scanner;

class customer{
	 private String customerName;
	String customerEmail;
	String customerType;

	String customerLocation;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}


	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getCustomerLocation() {
		return customerLocation;
	}

	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}
	
	public customer() {
		
	}

	public customer(String customerName, String customerEmail, String customerType, String customerLocation) {
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerType = customerType;
		this.customerLocation = customerLocation;
	}
	
	public void display() {
		System.out.println("Name: "+this.customerName);
		System.out.println("Name: "+this.customerEmail);
		System.out.println("Name: "+this.customerType);
		System.out.println("Name: "+this.customerLocation);
	}
}

public class Customerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter customer details");
		System.out.println("enter Name");
		String name = scan.next();
		System.out.println("enter Email");
		String email = scan.next();
		System.out.println("enter Type");
		String type= scan.next();
		System.out.println("enter Location");
		String location = scan.next();
		
		customer cust1 = new customer(name,email,type,location);
		
		cust1.display();
		
		
		// the  instance variables were not private we can directly print 
	//	System.out.println(cust1.customerName);
		System.out.println(cust1.customerEmail);
		System.out.println(cust1.customerType);
		System.out.println(cust1.customerLocation);
		

	}

}




























