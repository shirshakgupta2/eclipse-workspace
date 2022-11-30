package arrayevening;

import java.util.Arrays;
import java.util.Scanner;

public class median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int median=0;
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []a=new int [n];
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		}
		Arrays.sort(a);// for median no.s has to be in ascending order
		if(a.length/2==0) {
			 median=(a[a.length/2]+a[a.length/2+1])/2;
		
		}
		else {
			 median=a[a.length/2];
		}
		System.out.println(median);

	}

}
