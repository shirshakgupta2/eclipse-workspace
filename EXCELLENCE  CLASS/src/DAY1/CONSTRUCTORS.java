package DAY1;

import java.util.Scanner;

class product{
	private long id;
	private String productName;
	private String supplierName;
	public product() {
	}
	public product(long id, String productName, String supplierName) {
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
	void display() {
		System.out.println("Product id is "+id);
		System.out.println("Product Name is "+productName);
		System.out.println("Supplier Name is "
				+ ""+supplierName);
		
	}
}
public class CONSTRUCTORS {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the product id");
		long id =scan.nextLong();
		System.out.println("Enter the product name");
		String productName=scan.next();
		System.out.println("Enter the supplier name");
		String supllierName=scan.next();
		product product = new product(id,productName,supllierName);
		product.display();
		
		
	}

}
