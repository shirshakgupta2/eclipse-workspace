class Exmp extends Thread{
	public void run() {
		// TODO Auto-generated method stub
		printAlpha();
	}
	void printAlpha() { //throws InterruptedException{
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
public class joinmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread started and estd conn");
		Exmp e= new Exmp();
		e.start();
		try {
			e.join();// this will wait for the run method to complete otherwise 
			//main method will be complted and conn be lost and e thread will not be able to 
			// fetch any details from main method
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("main thread completed and closed connection");

	}

}
