
 class Printer1 implements Runnable{
	synchronized public void run()
	 {
		 Thread t = Thread.currentThread();
		 String name =t.getName();
			try {
				 System.out.println(name+"Accessed the printer");
				 Thread.sleep(2000);
				 System.out.println(name+" is using the printer");
				 Thread.sleep(2000);
				 System.out.println(name+" is using the printer");
				 Thread.sleep(2000);
				 System.out.println(name+" is using the printer");
				 Thread.sleep(2000);
				 System.out.println(name+" finished printing");
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
 }
public class syncprinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Printer1 p1 = new Printer1 ();  // job that is suppose to be performed 
	   Thread t1 = new Thread(p1);
	   Thread t2 = new Thread(p1);
	   Thread t3 = new Thread(p1);
	   t1.setName("rohit ");
	   t2.setName("shirshak ");
	   t3.setName("poo ");
	   t1.start();
	   t2.start();
	   t3.start();

	}

}

