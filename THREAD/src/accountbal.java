class customer1{
	String name;
	int acc_bal;
	
	public customer1(String name, int acc_bal) {
		this.name = name;
		this.acc_bal = acc_bal;
	}

	void withdraw(String mode) throws InterruptedException{
		for (int i = 0; i < 5; i++) {
			System.out.println(this.name+" "+"transaction intiated "+mode);
			Thread.sleep(800);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(this.name+" "+"withdrawing money through "+mode);
			this.acc_bal -= 500;
			System.out.println(acc_bal);
			Thread.sleep(800);
		}
		synchronized (mode) {
			notify();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(this.name+" "+"transaction completed "+mode);
			Thread.sleep(800);
		}
	}
}
class bank11 extends Thread{
	String mode;
	customer1 c;
	public bank11(customer1 c,String mode) {
		this.mode = mode;
		this.c=c;
	}

	@Override
	public void run() {
		try {
			c.withdraw(mode);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class accountbal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 customer1 alex = new customer1("alex",10000);
		 bank11 t1 = new bank11(alex,"gpay");
		 System.out.println(alex.name+"intial acc_bal is "+alex.acc_bal);
		 
		 t1.start();
		 
		/* t1.join();// for join() t1 thread has to completly finish execution but in our case we dont want t1 to execute completly
		    */  // rather as moneey is withdrawel main thread can start executing so we use wait method
		
		 
		/* t1.wait();// wait has to be always in sync block*/
		 
		 synchronized (alex) {// here we wrote alex becoz wait is getting notified from customer object so here we wrote alex
			alex.wait();// calling wait method which is inside object class and customer class extends object class
			// so it has wait inside wo we caleed alex.wait
			v
		}
		 
		 System.out.println(alex.name+"final accoutn balance is "+alex.acc_bal);
		 

	}

}
