package oops;
/*class Account{
	int bal;
}*/     // as we write private we cannot access bal directly in a.bal
class Account{
	private int bal;// moment we make it private it is access able only within the class
	public void setData(int x) {
		//bal=x;
		if(x>=0) {
			bal=x;
		}
		else {
			System.out.println("invalid input");
			System.exit(0);// to terminate the program we use this
			               // break and all closes the loops 
		}
 	}
	public int getData() {
		return bal;
	}
	}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a= new Account();  
	/*	a.bal=10000;                  // for having a controlled access we have to have setters and getters inn this
		System.out.println(a.bal);*/
		a.setData(-100000);
		System.out.println(a.getData());

	}

}
