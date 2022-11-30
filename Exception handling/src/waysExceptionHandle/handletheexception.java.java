package waysExceptionHandle;

import java.util.Scanner;

class Test{
	void fun() {
	System.out.println("conn1 estd");
	Scanner scan =new Scanner(System.in);
	try {
		System.out.println("enter numerator");
		int a=scan.nextInt();
		System.out.println("enter denominator");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);

	}
	catch(Exception e) {
		System.out.println("exception handled ");
	}
	System.out.println("conn of fun is terminated");
	
	}
}
	

	
public class handletheexception {

	public static void main(String []args) {
			System.out.println("conn is estd in main class");
			Test t=new Test();
			t.fun();
			System.out.println("conn is terminated of main class");
		}
}


