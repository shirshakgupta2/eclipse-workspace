import java.util.InputMismatchException;
import java.util.Scanner;

public class singletrymulticatch {

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
			
			ar=null;
			System.out.println(ar[index]);
		}
		
		
		catch (ArithmeticException ae) {
			System.out.println("invalid input provide non zero denominator");
		}
		catch(NegativeArraySizeException nae){
			System.out.println("provide +ve array size");
		}
		catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("please provide index between the array sizeand a positive value");
		}
		catch(InputMismatchException imme){
			System.out.println("please provide an interger vale only");
		}
		
		catch(Exception e) {// this is called generic catch block and others are called specific catch block
			System.out.println("some problem occured");
		}
		System.out.println("conn terminated");

	}

}
