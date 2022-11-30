import java.util.Scanner;

public class GCDorHCF {
	static int gcd(int a,int b) {
		int min=0;
		if(a<b) {
			min=a;
		}
		else {
			min=b;
		}
		for (int i = min; i >=1; i--) {
			if(a%i==0&&b%i==0) {
				return i;
			}
		}
		return -1;
	}

	static int euclidGcd(int a,int b) {
		while(a!=0&&b!=0) {
			if(a>b) {
				a=a%b;
			}
			else
				b=b%a;
		}
		if(a!=0) {
			return a;
		}
		return b;
		
	}
	
	static int modifiedEuclidGcd(int a,int b) {
		while(a!=b) {
			if(a>b) {
				a=a-b;
			}
			else
				b=b-a;
		}
		return a;
		
	}
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
//		int a=scan.nextInt();
//		int b=scan.nextInt();
//		System.out.println(gcd(a,b));
//		System.out.println(euclidGcd(a, b));
		
		
		System.out.println(n);
	}

}