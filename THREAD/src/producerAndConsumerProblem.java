class Queue{
	int x;
	boolean is_data_present=false;
	
	synchronized void  Store(int j) {
		try {
			if(is_data_present==false) {
				x=j;
				System.out.println("produced"+x);
				is_data_present=true;
				notify();
			}
			else {
				wait();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("some problem occered");
		}
		
	}
	synchronized  void retrive() {
		try {
			if(is_data_present==true) {
				System.out.println("consumed"+x);
				is_data_present=false;
				notify();
			}
			else {
				wait();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("some problem occered");
		}
	}
}
class Producer extends Thread{
	Queue a;
	
	public Producer(Queue q) {
		this.a = q;
	}

	@Override
	public void run() {
		int i=1;
		for(;;) {
			a.Store(i++);
		}
	}
}
class Consumer extends Thread{
	Queue b;

	public Consumer(Queue b) {
		this.b = b;
	}
	@Override
	public void run() {
		for(;;) {
			b.retrive();
			
		}
	}
	
}
public class producerAndConsumerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();// we could have defined it inside producer class as well but to use our oops concept
		            // we define it in main and then by the help of constructor of producer class we 
		            // pass this object of queue class to the parameterized constructor 
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		
		p.start();
		c.start();

	}

}
