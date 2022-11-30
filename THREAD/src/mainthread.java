class myTask1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		addition();
		
		super.run();
	}
	void addition(){
		int a=6,b=5;
		System.out.println(a+b);
	}
}
class myTask2 extends Thread{
	
	myTask2(){
		                        //ways to change the name of the thread to what we want through a counstructor
	}          // of the class which is extends Thread class
	myTask2(String name){
		super(name);   /* so basically inside the thread class there is a constructur which is accepting a input of name of  thread
	class Thread {
	   Thread(String name)[
	            this.name=name;
	    }          
	}
	*/
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			printNo();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.run();
	}
	
	void printNo() throws InterruptedException{
		for(int i=1;i<27;i++) {
			System.out.println(i);
			Thread.sleep(500); 
		}
	}
}
class myTask3 extends Thread{
	
	
}
public class mainthread {
	public static void main(String[] args) {
		 myTask1 myTask = new myTask1();
		 myTask2 myTask1 = new myTask2("print no" );// here we pass the name of the thread what we want to chnge
		 myTask3 myTask2 = new myTask3();
		 /*myTask.run();
		 myTask1.run();
		 myTask2.run();*/
		 myTask.start();
		 myTask1.start();
		 myTask2.start();
		 myTask1.setPriority(-10);// illegal argument exception
		 System.out.println(myTask1);
		 
	}
}
