class test1 extends Thread{
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
public class userThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main thread started execution");
		Thread t1=new test1();
		t1.start();
		System.out.println("main thread finished execution");
	}

}
