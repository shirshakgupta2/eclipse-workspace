import java.util.Scanner;

public class Prime {
	static boolean isPrime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
			
		}
		return true;
	}
	static boolean checkPrime(int n) {
		if(n==1)
			return false;
		if(n==2||n==3)
			return true;
		if(n%2==0||n%3==0)
			return false;
		//for (int i = 5; i < =Math.sqrt(n); i=i+6) {
		for (int i = 5; i*i<=n; i=i+6) {
		
			if(n%i==0||n%(i+2)==0)
				return false;
		}
		return true;
	}
	static void printPrime(int n) {
		for (int i = 2; i <=n; i++) {
			if(checkPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	static void sievePrintPrime(int n) {
		boolean[] prime =new boolean[n+1];
		for (int i = 2; i<= n; i++) {
			if(prime[i]==false) {
				for(int j=i*2;j<=n;j=j+i) {
					prime[j]=true;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(prime[i]==false) {
				System.out.println(i);
				
			}
		}
	}
	static void sieveModifiedPrintPrime(int n) {
		boolean[] prime =new boolean[n+1];
		
		for (int i = 2; i*i<=  n; i++) {
			if(prime[i]==false) {
				for(int j=i*i;j<=n;j=j+i) {
					prime[j]=true;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(prime[i]==false) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(isPrime(n));
		System.out.println(checkPrime(n));
		printPrime(n);
		System.out.println("----------");
		sievePrintPrime(n);
	}

}
