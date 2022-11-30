package DAY1;

import java.util.Iterator;
import java.util.Scanner;

class Address{
	String street;
	String city;
	int pincode;
	
	public Address() {
	}
	public Address(String street, String city, int pincode) {
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Address a1=this;
		Address a2=(Address) obj;
		return 
				a1.street.equals(a2.street)
				&&
				a1.city.equals(a2.city)&&
				a1.pincode==(a2.pincode);
		
	}
	
}
class Customer4{
	String name;
	Address address;
	
	
	public Customer4() {
	}
	public Customer4(String name, Address address) {
		this.name = name;
		this.address = address;
	}
    public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    public Address getAddress() {
		return address;
	}
    public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Customer4 c1=this;
		Customer4 c2=(Customer4) obj;
		
		Address address1=c1.address;
		Address address2=c2.address;
		 return c1.name.equals(c2.name)&&address1.equals(address2);
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Name:"+name+"\nAddress:"+address.street+","+address.city+"-"+address.pincode);	
	}
	

}


public class EQUALS {
	public static void printDuplicates(Customer4 []ar) {
		for (int i = 0; i < ar.length-1; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i].equals(ar[j])) {
					System.out.println(ar[i]);
				}
				else {
					System.out.println("No Duplicates details");
				}
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no. of customer");
		int n=scan.nextInt();
		Customer4 []ar=new Customer4[n];
		int i=0;
		do {
			System.out.println("Enter the details of customer "+""+(i+1));
			System.out.println("Enter the Name");
			String name=scan.next();
			System.out.println("Enter the address details");
			System.out.println("enter the street");
			String street=scan.next();
			System.out.println("enter the city");
			String city=scan.next();
			System.out.println("enter the pincode");
			int pincode=scan.nextInt();
			Address address = new Address(street,city,pincode);
		
			
			Customer4 c=new Customer4(name,address);
			ar[i]=c;
			i++;
		}
		while(i<n);
		printDuplicates(ar);
		//System.out.println(ar[0]);
		
		

	}

}
