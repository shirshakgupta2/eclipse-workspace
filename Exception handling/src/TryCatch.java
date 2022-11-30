import java.util.Scanner;

public class TryCatch {
	public static void main (String []args) {
	Scanner scan =new Scanner(System.in);
	try {
		System.out.println("enter numerator");
		int a=scan.nextInt();
		System.out.println("enter denominator");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);
	}
	catch(Exception e){
		System.out.println("please provide non zero denominator");
		
	}
	System.out.println("connection is terminated");
	
	}

}
