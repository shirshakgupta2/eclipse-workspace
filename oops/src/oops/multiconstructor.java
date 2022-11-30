package oops;
class Customer3{
	private int cID;
	private String cName;
	private int cNum;
	public Customer3() {
		cID=002;
		cNum=97192;
	}
	public  Customer3 (int cID,String cName,int cNum) {
		this(cName);  // this is to call the constructor Customer3 having single parameterized
		this.cID=cID;  
		this.cName=cName;// LOCAL CHAINING  is a process
		    // local cName is assigned to instance variable cName
	}
	public Customer3(String cName) {
		this.cName="rahul";
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
public class multiconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer3 c=new Customer3(112,"shirshak",998162563); 
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getNum());

	}

}
