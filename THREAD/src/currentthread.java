
public class currentthread {
	static void fun1() {
		Thread e=Thread.currentThread();
		e.setName("fun1");
		System.out.println(e);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		String t2 = Thread.currentThread().getName();
		System.out.println(t);
		System.out.println(t2);
		fun1();
		

	}

}

