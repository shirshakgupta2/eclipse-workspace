//https://www.hackerrank.com/challenges/the-hurdle-race/problem
import java.util.Scanner;

public class Hurdlerace {
public static void main(String args[]) {
	Scanner scan= new Scanner(System.in);
	int k=scan.nextInt();
	int n=scan.nextInt();
	
	
	
	int max=0;
	int a[]=new int[n];
	for(int i=0;i<a.length;i++) {
		 a[i]=scan.nextInt();
	}
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	System.out.println(max-k);
}
}
