class test2 extends Thread{
	public void  run() {
		System.out.println("user thread started execution");
		for (int i = 0; i <=5; i++) {
			System.out.println("user thread s excuting..");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("user thread ended execution");
		
	}
}
class test3 extends Thread{
	public void  run() {
		System.out.println("daemon thread started execution");
		for (; ;) {// THIS IS INFINTE LOOP WAND WILL EXECUTE AS LONG AS ALL USER THREADS ARE NOT FINISHED SINCE
			           // IT IS A DAEMON THREAD
		
			System.out.println("user DAEMON is excuting..");
			try {
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
		
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//System.out.println("daemon thread ended execution");
	}
}
public class daemonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread started execution");
		Thread t1=new test2();
		t1.start();
		Thread t2=new test3();
		t2.setDaemon(true);
		t2.start();
		System.out.println("main thread finished execution");

	}

}
