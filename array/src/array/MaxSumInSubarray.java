package array;

import java.util.Scanner;

public class MaxSumInSubarray {
	static void suminsubarray(int a[]) {
		int k=a.length,sum=0,max_sum=0;
		while(k>0) {
			for (int i = 0; i <= a.length-k; i++) {
				for (int j = i; j < i+k; j++) {
					//System.out.print(a[j]+" ");
					sum=sum+a[j];
					
				}
				if(max_sum<=sum) {
					max_sum=sum;
				}
				sum=0;
				//
			}
			k--;
		}
		System.out.println(max_sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		}
		suminsubarray(a);

	}

}
