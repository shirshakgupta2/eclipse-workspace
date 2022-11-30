class myTask21 extends Thread {//implements Runnable {
	@Override
	public void run() {
		System.out.println(this.getName());
		Thread t = Thread.currentThread();// this is also a way to get the name of thread and giving it a refrence
		//String name=this.getName();//
		String name=t.getName();
		if(name=="addition") {
			addition();
		}
		else if(name.equals("printNum")) {
			try {
				printNo();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (name=="printAlpha") {
				printAlpha();
				}
	}
	void addition(){
		int a=6,b=5;
		System.out.println(a+b);
	}
	void printNo() throws InterruptedException{
		for(int i=1;i<27;i++) {
			System.out.println(i);
			Thread.sleep(500);
		}
	}
	void printAlpha() {
		for(char i='A';i<='Z';i++) {
			System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
public class sameclassmultithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread myt211=new myTask21();
		myTask21 myt212=new myTask21();
		myTask21 myt213=new myTask21();
		
//	    Thread t1=new Thread(myt211);
//	    Thread t2=new Thread(myt212);
//	    Thread t3=new Thread(myt213);   // this is require whern we are making runnable interface and implementing runnable
	    
	    myt211.setName("addtion");
	    myt212.setName("printNum");
		myt213.setName("printAlpha");
		
		myt211.start();
		myt212.start();
		myt213.start();
		//myt21.run();
		
	}

}
