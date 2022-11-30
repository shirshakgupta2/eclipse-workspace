class myTask11 implements Runnable{
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		addition();
	//	super.run();
	}
	void addition(){
		int a=6,b=5;
		System.out.println(a+b);
	}
}

class myTask22 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			printNo();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	super.run();
	}
	void printNo() throws InterruptedException{
		for(int i=1;i<27;i++) {
			System.out.println(i);
			Thread.sleep(500);
		}
	}
}

class myTask33 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			printAlpha();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//super.run();
	}
	void printAlpha() throws InterruptedException{
		for(char i='A';i<='Z';i++) {
			System.out.println(i);
			Thread.sleep(500);
		}
	}
}

public class runnableinterface {

	public static void main(String[] args) {
		myTask11 task11 = new myTask11();
		myTask22 task22 = new myTask22();
		myTask33 task33 = new myTask33();
		
		//task11.start();// this is not possibe since we didnt extend thread and runnable class doesnt contains start method instead Thread class 
		//contains start method without passing any referance  so there is a contructor who is waiting for the ref or a parameter to execute
		
		Thread t1 = new Thread(task11);
		Thread t2 = new Thread(task22);
		Thread t3 = new Thread(task33);
		
		
		
		t1.start();
		t2.start();
		t3.start();
//		
//		System.out.println(t1);
//		System.out.println(t2);
//		System.out.println(t3);
//		
//		t1.setName("additon");
//		t2.setName("printno");
//		t3.setName("printalpha");
//		
//		System.out.println(t1);
//		System.out.println(t2);
//		System.out.println(t3);
	}

}
