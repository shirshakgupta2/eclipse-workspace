class test4 extends Thread{
	public void run() {
		System.out.println("typing started");
		for (int i = 0; i < 6; i++) {
			System.out.println("typing..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("typing ended");
	}
}
class test5 extends Thread{
	public void run() {
		System.out.println("code compilation started");
		for (; ;) {
			System.out.println("continue compiling happens");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//System.out.println("typing ended");
	}
}
class test6 extends Thread{
	public void run() {
		System.out.println("saving started");
		for (; ;) {
			System.out.println("saving continues");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//System.out.println("typing ended");
	}
}

public class eclipse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread started execution");
		Thread t4=new test4();
		t4.setName("TYPE");
		Thread t5=new test5();
		t4.setName("COMPLETE");
		Thread t6=new test6();
		t4.setName("SAVE");
		
		t4.start();
		t5.setDaemon(true);
		t6.setDaemon(true);
		t5.start();
		t6.start();
		System.out.println("main thread finished execution");

	}

}
