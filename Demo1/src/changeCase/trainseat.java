package changeCase;

import java.util.Iterator;
import java.util.Scanner;

public class trainseat {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n>=1&&n<=72) {
			for(int i=0;i<9;i++) {
				if(n>8*i&&n<=8*(i+1)) {
					if(n==(8*i)+1||n==(8*i)+4) {
						System.out.println("lower berth");
					}
					if(n==(8*i)+2||n==(8*i)+5) {
						System.out.println("middle berth");
					}
					if(n==(8*i)+3||n==(8*i)+6) {
						System.out.println("upper berth");
					}
					if(n==(8*i)+7) {
						System.out.println("side lower berth");
					}
					if(n==(8*i)+8) {
						System.out.println("side upper berth");
					}
				}
			}
		}
	}

}
