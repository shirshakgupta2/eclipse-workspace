package DAY1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
class Product3{
	private long id;
	private String name;
	private String supplierName;
	private int price; 
	
	public Product3() {
		
	}
	public Product3(long id, String name, String supplierName, int price) {
		super();
		this.id = id;
		this.name = name;
		this.supplierName = supplierName;
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "( "+this.id + " , "+this.name+" , " +this.supplierName+" , "+this.price+" )";
	}
	
}
 
class ProductBO{
	public static void displayAllProductDetails(Product3[] products, int count) {
//		 Logic
		for (Product3 product : products) {
			System.out.println(product); 
		}
		
	}
}
public class test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String choice= "yes";
		
		ArrayList<Product3> products = new ArrayList<Product3>();
		
		while(choice.equalsIgnoreCase("yes"))  
		{
			System.out.println("Enter id: ");
			long id = scan.nextLong();
			
			System.out.println("Enter name: ");
			String name = scan.next();
			System.out.println("Enter supplierName: ");
			String supplierName = scan.next();
			
			System.out.println("Enter price: ");
			int price = scan.nextInt();
			
			Product3 p = new Product3(id, name, supplierName, price);
			products.add(p);
			
			System.out.println("Do you want to enter the details of another product? Enter yes or no (not case sensitive)");
			choice = scan.next();
		}
		
		
		
		
		
//		Product[] ar = (Product[]) products.toArray();
		
		Product3[] ar = new Product3[products.size()];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = products.get(i);
		}
		
		
		ProductBO.displayAllProductDetails(ar, ar.length);
	}
}
