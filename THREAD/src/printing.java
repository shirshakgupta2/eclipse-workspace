 class Printer implements Runnable{
	 public void run()
	 {
		 Thread t = Thread.currentThread();
		 String name =t.getName();
		
			try {
				 System.out.println(name+"Accessed the printer");
				 Thread.sleep(2000);
				 System.out.println(name+"is using the printer");
				 Thread.sleep(2000);
				 System.out.println(name+"is using the printer");
				 Thread.sleep(2000);
				 System.out.println(name+"is using the printer");
				 Thread.sleep(2000);
				 System.out.println(name+"finished printing");
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		 
     }
 }
public class printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Printer p = new Printer ();  // job that is suppose to be performed 
	   Thread t1 = new Thread(p);
	   Thread t2 = new Thread(p);
	   Thread t3 = new Thread(p);
	   t1.setName("rohit");
	   t2.setName("shirshak");
	   t3.setName("poo");
	   t1.start();
	   t2.start();
	   t3.start();

	}

}
