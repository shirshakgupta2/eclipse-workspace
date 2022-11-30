class Demo extends Thread{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name=t.getName();
		if(name=="TYPE")
			codeType();
		else if(name=="COMPLETE")
			codeComplete();
		else 
			autoSave();
		super.run();
	}
	public void codeType() {
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
	public void codeComplete() {
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
	public void autoSave() {
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
public class eclipsemultithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread started execution");
		Thread t4=new Demo();
		t4.setName("TYPE");
		Thread t5=new Demo();
		t5.setName("COMPLETE");
		Thread t6=new Demo();
		t6 .setName("SAVE");
		
		t4.start();
		t5.setDaemon(true);
		t6.setDaemon(true);
		t5.start();
		t6.start();
		System.out.println("main thread finished execution");


	}

}
