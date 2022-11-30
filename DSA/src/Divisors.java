import java.util.Scanner;

public class Divisors {
	static void basicApprochOfDivisor(int n) {
		for (int i = 1; i <=n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
	static void efficientApprochDivisor(int n) {
		for (int i = 1; i*i <=n; i++) {
			if(n%i==0) {
				if(i==n/i) {
					System.out.println(i);
				}
				else
					System.out.println(i+" "+n/i);
			}
		}
	}
	static void efficientApprochDivisorInAscending(int n) {
		int i=0;
		for ( i = 1; i*i <=n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		for(;i>=1;i--) {
			if(n%i==0&&i!=n/i ) {
				System.out.println(n/i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		basicApprochOfDivisor(n);
		efficientApprochDivisor(n);
	}
}

