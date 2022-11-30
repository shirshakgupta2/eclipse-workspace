package hackerRank;

import java.util.Scanner;

public class Subarraydivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n =scan.nextInt();
		int[]a=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		}
		int count=0;
		int d =scan.nextInt();
		int m =scan.nextInt();
		for (int i = 0; i <= a.length-m; i++) {
			int sum=0;
			for (int j = i; j <= i+m-1; j++) {
				//System.out.print(a[j]);
				sum=sum+a[j];
				if(sum==d&&j==i+m-1) {
					count=count+1;
				}
				System.out.print(sum+" ");
			}
			System.out.println();
		}
		System.out.println(count);
	}

}
