import java.util.Scanner;

public class Primefactor {
	static void primeFactor(int n) {
		int i=2;
		while(n> 1) {
			while(n%i==0) {
				System.out.println(i);
				n=n/i;
			}
			i++;
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		primeFactor(n);
	}
}

