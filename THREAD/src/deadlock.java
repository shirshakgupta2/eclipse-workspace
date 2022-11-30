class family implements Runnable{
	String resource1="TV";
	String resource2="playstation";

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		if (name.equals("rohit"))
			rohitAccResource1();
		else if(name.equals("vijay"))
			vijayAccResource1();
		
		
	}
	void rohitAccResource1() {
		synchronized (resource2) {// this will pass obj of string to syncronized to make it locked
			try {
				System.out.println("rohit accquired tv");
				Thread.sleep(3000);
				synchronized (resource1) {
					System.out.println("rohit accquired ps1 as well");
					Thread.sleep(3000);

				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("rohit failed");
			}
		}
	}
	void vijayAccResource1() {
		synchronized (resource1) {// this will pass obj of string to syncronized to make it locked
			try {
				System.out.println("vijay accquired tv");
				Thread.sleep(3000);
				synchronized (resource2) {
					System.out.println("vijay accquired ps1 as well");
					Thread.sleep(3000);
					
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("vijay failed");
			}
		}
	}
	
}
public class deadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		family family = new family();
		Thread t1 = new Thread(family);
		Thread t2 = new Thread(family);
		
		t1.setName("rohit");
		t2.setName("vijay");
		t1.start();
		t2.start();

	}

}
