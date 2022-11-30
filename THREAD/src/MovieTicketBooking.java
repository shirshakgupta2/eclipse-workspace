class customer21{
	 static String name;
	customer21(String name){
		this.name=name;
	}
	synchronized  static void booking( String mode) {// sync
		
		for (int i = 0; i < 5; i++) {
			System.out.println(name+" booking movie ticket "+mode);
		}
		
	}
}
class BookMyShow extends Thread {
	String mode;
	customer21 c;
	BookMyShow(customer21 c,String mode){
		this.c=c;
		this.mode=mode;
	}
	@Override
	public void run() {
		c.booking(this.mode);
		
	}
}
public class MovieTicketBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer21 alex=new customer21("alex");
		
		BookMyShow t1=new BookMyShow(alex,"app");
		t1.start();
//		BookMyShow t2=new BookMyShow(alex,"web");
//		BookMyShow t3=new BookMyShow(alex,"iosapp");
		
		customer21 adam=new customer21("adam");
		
//		BookMyShow t4=new BookMyShow(adam,"app");
//		BookMyShow t5=new BookMyShow(adam,"web");
		BookMyShow t6=new BookMyShow(adam,"iosapp");
		
		
		
//		t2.start();
//		t3.start();
//		t4.start();
//		t5.start();
		t6.start();

	}

}
