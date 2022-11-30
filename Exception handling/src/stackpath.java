import java.util.Scanner;

class demo3{
	void fun3() {
		System.out.println("conn4 estd");
		Scanner scan =new Scanner(System.in);
		//try {
			System.out.println("enter numerator");
			int a=scan.nextInt();
			System.out.println("enter denominator");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
		//}
	//	catch(Exception e){
	//		System.out.println("problem occured");
	//	}
			System.out.println("conn4 terminated");
		
	}
}
class demo2{
	void fun2() {
		System.out.println("conn3 is estd");
		try {
		demo3 d3=new demo3();
		d3.fun3();
		}
		catch(Exception e) {
			System.out.println("problem occerd");
		}
		System.out.println("conn3 terminated");
	}
}
class demo1{
	void fun1() {
		System.out.println("conn2 is estd");
		demo2 d2=new demo2();
		d2.fun2();
		System.out.println("conn2 terminated");
	}
}

public class stackpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("conn1 estd");
		demo1 d1 = new demo1();
		d1.fun1();
		System.out.println("conn1 terminated");

	}

}





// if no try catch is given then 
/*
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at demo3.fun3(stackpath.java:12)
	at demo2.fun2(stackpath.java:22)
	at demo1.fun1(stackpath.java:30)
	at stackpath.main(stackpath.java:41)
*/

// if try catch is given in fun3  then it will pass clrly

//if their is any Exception object then code will search for try catch and when try is given in fun 2 and catch is given in fun2 or fun 1
//it will not abruptly terminated
// rather it will check in the method in which it was called as in here fun2


//if try catch is in other fun or class rather in same fun it will not terminate conn 4 


















