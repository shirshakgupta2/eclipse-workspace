class House implements Runnable{

	@Override
	public void run() {
		String name= Thread.currentThread().getName();
		try {
			System.out.println(name+" accessing the room1");
			Thread.sleep(3000);
			System.out.println(name+" accessing the room2");
			Thread.sleep(3000);
			System.out.println(name+" accessing the room3");
			Thread.sleep(3000);
			synchronized (this) {// local variable inside main will not be accessible inside other class so accessing the object of house class
				             // we have to take the object name that is automatically given by JVM is THIS witin a class
				System.out.println(name+" accessing the bathroom");
				Thread.sleep(3000);
				System.out.println(name+" using the bathroom");
				Thread.sleep(3000);
				System.out.println(name+" using the bathroom");
				Thread.sleep(3000);
				System.out.println(name+" finished using bathroom");
				Thread.sleep(3000);
			}
			
			System.out.println(name+" accessing the hall");
			Thread.sleep(3000);
			System.out.println(name+" accessing the hall");
			Thread.sleep(3000);
			System.out.println(name+" accessing the sofa");
			Thread.sleep(3000);
			System.out.println(name+" accessing the sofa");
			Thread.sleep(3000);
			
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
public class partsync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House house = new House();
		Thread t1=new Thread(house);
		Thread t2=new Thread(house);
		Thread t3=new Thread(house);
		t1.setName("rohit");
		t2.setName("shirshak");
		t3.setName("poo");
		t1.start();
		t2.start();
		t3.start();

	}

}
