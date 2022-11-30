package oops;
class Customer1{
	private int cID;
	private String cName;
	private int cNum;
	public  Customer1 (int cID,String cName,int cNum) {
		this.cID=cID;
		this.cName=cName;  
		this.cNum=cNum;
	}
	public Customer1() {
		
	}
	public int getId() {
		return cID;
	}
	public String getName() {
		return cName;
		
	}public int getNum() {
		return cNum;
	}
}
	
public class consturctor {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer(112,"shirshak",998162563); 
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getNum());
		Customer1 c1=new Customer1(); //non parameterized consturctor is not defined
		     // as we define empty constructor then error goes
		System.out.println(c1.getId());
		System.out.println(c1.getName());
		System.out.println(c1.getNum());
		



	}

}
