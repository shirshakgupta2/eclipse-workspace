package oops;
class Customer{
	private int cID;
	private String cName;
	private int cNum;
	/*public void setData(int id,String name,int num) {*/    //not an effcinent way to write 
	                                          // becoz we can not change the refrence that we gave earlier
/*		public void setData(int cID,String cName,int cNum) {
		/*cID=cID;
		cName=cName;  // these are the convention but it will not give perfect result
		cNum=cNum;*/  // this is called shadowing
			
	   /* this.cID=cID;
		this.cName=cName;  // these are the convention but it will not give perfect result
		this.cNum=cNum;	    // this is written to treat it as a instance variable and have a proper access
		                  //without shadowing issue
	}*/
		public  Customer (int cID,String cName,int cNum) {    // java has its own setter then why to make our own setters that
			                        // that is why we are using java's setter
			
			          // java's setters is known as CONSTRUCTORS//constructor is a special setter which doesnt have a return type and has Name same as that of 
			           //class name
			this.cID=cID;
			this.cName=cName;  // these are the convention but it will not give perfect result
			this.cNum=cNum;	    // this is written to treat it as a instance variable and have a proper access
			//without shadowing issue
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

public class CustomerDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Customer c=new Customer(); // c is a local object created which is only accessable inside main method
		c.setData(112,"shirshak",998162563);  // so java  itself cretaes a object  known as "this" with same refrence as c
		System.out.println(c.getId());*/
		//Customer c=new Customer(); // what we were actually calling was a constructor and the constructor we are calling is parametrized with three parameter 
		Customer c=new Customer(112,"shirshak",998162563); 
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getNum());
		

	}

}
