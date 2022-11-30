import java.util.Scanner;

public class trycatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter numerator");
		try {
			int a=scan.nextInt();
			System.out.println("enter denominator");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
			
			System.out.println("enter size of array");
			int size=scan.nextInt();
			int []ar=new int[size];
			System.out.println("enter the element to be enterd in an array");
			int ele=scan.nextInt();
			System.out.println("enter index in which it is to be entered");
			int index=scan.nextInt();
			ar[index]=ele;
			System.out.println(ar[index]);
			System.out.println("conn terminated");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("invalid input");
			System.out.println("some problem occured");
		}
		System.out.println("conn terminated");

	}

}


//if try catch or say user defind handler not used
/*
enter denominator
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at trycatch2.main(trycatch2.java:13)*/


/*
   enter size of array
-10
Exception in thread "main" java.lang.NegativeArraySizeException: -10
	at trycatch2.main(trycatch2.java:18)*/




/*
enter size of array
5
enter the element to be enterd in an array
10
enter index in which it is to be entered
10
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
	at trycatch2.main(trycatch2.java:23)*/


/*
 * enter size of array
five
Exception in thread "main" java.util.InputMismatchException
 */







