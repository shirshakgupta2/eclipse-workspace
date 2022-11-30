package waysExceptionHandle;

import java.util.Scanner;

class Test12{
	void fun() throws Exception 
	{
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
		System.out.println("exception handled inside fun");
		throw e; //(controller moves to main) // after throwing control goes outside where it came from(throw down the stack) and this will not allow the forward movement of 
	              // the code in fun method and  lines below will not be executed
	}
	
	finally {// finally will help to rethrow and imp  or essetial part of code to execute like terminating a connection
		System.out.println("conn of fun is terminated");
	}
	}
}
public class rethrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("conn is estd in main class");
		try { // when throwing an excepton to main class  or down the stake try catch has to be there
		Test12 t=new Test12();// if i dont put try and catch in main then it will not be handeled inside main
		t.fun();// therefore we have to put try catch inside main
		}
		catch(Exception e){// if exception was not thrown down the stack then this would not have been executed
			System.out.println("handaled inside  main");
		}
		System.out.println("conn is terminated of main class");

	}

}

// throws is used for warning the method that it can show the exception while executing with faulty inputs
