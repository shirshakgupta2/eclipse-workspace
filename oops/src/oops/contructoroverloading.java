
package oops;
 // LOCAL CHAINING BY THIS()//
class Customer2{
	private int cID;
	private String cName;
	private int cNum;
	public Customer2() {
		cID=002;
		cName="shirshak";
		cNum=5546418;
	}
	public  Customer2 (int cID,String cName,int cNum) {
		/*this.cID=cID;
		this.cName=cName;  
		this.cNum=cNum;*/
		
		this();// this means calling a constructor in the same class without parameters  
		this.cID=cID;         // LOCAL CHAINING  is a process
		this.cName=cName;    // local cName is assigned to instance variable cName
		this.cNum=cNum;
		/*this();*/   // this () method has to be called  at the starting only
	}
	public void setData(int cID,String cName,int cNum) {
		/*this()*/    // this  method can only be used inside constructor only not inside method
		this.cID=cID;         // LOCAL CHAINING  is a process
		this.cName=cName;  
		this.cNum=cNum;
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
	
public class contructoroverloading {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer2 c=new Customer2(112,"shirshak",998162563); 
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getNum());
		



	}

}




