package array;

import java.util.Scanner;

public class subarray {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		
		
		int a[]=new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
	//	System.out.println("enter the value of length of subarray");
		//int k=scan.nextInt();
		int k=1;
		while(k<=a.length) {
		for(int i=0;i<=a.length-k;i++) {
			for(int j=i;j<i+k;j++) {
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
		
		k++;
		}

		
		
	}
	
 

}
