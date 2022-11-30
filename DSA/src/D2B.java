import java.util.Scanner;

public class D2B {
	static String decimalToBinary(int n) {
		String b="";
		
		while(n>=1) {
			int x=n%2;
			n=n/2;
			b=x+b;
		}
		return(b);
	}
	static void binaryTODecimal(String b) {
		int result=0;
		int powof2=1;
		for (int i = b.length()-1; i>=0; i--) {
			if(b.charAt(i)=='1') {
				result+=powof2;
			}
			powof2*=2;
		}
		System.out.println(result);
	}
 public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String b = decimalToBinary(n);
		System.out.println(b);
		binaryTODecimal(b);
		
}
}
