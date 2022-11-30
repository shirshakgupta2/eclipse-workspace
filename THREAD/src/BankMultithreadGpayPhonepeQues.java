class Customer {
	String name;
	Customer(){
	}
	Customer(String name){
		this.name=name;
	}
	/*public void withdraw( String mode) {// sync keyword will only allow the thread which comes first then when that finishes it calls secound thread
	 * 
	*/
	synchronized public void withdraw( String mode) {// sync
		for (int i = 0; i < 5; i++) {
			System.out.println(this.name+" "+"withdrawing money through "+mode);
		}
		
	}
}
class bank extends Thread{
	Customer cust_name;
	String mode;
	bank(){
	}
	bank(Customer cust,String mode){
		this.cust_name=cust;
		this.mode=mode;
	}
	@Override
	public void run() {
		/*Customer alex = new Customer("alex");// while creating the object of custimer here it obeject is getting created again again inheap with name alex but as
		   */           //as our situatin there is only one customer doing multi transaction same time
		cust_name.withdraw(mode);
	}
}
public class BankMultithreadGpayPhonepeQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer alex = new Customer("alex");
		bank t1=new bank(alex,"Atm");
		bank t2=new bank(alex,"Phonepe");
		bank t3=new bank(alex,"Gpay");
		t1.start();
		
		t2.start();
		t3.start();
		new StringBuffer();
		new StringBuilder();
		

	}

}
