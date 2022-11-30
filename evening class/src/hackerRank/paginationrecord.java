package hackerRank;

import java.util.Scanner;

public class paginationrecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the total no of records:");
		int n=scan.nextInt();
		System.out.println("Records per page :");
		int k=scan.nextInt();
		int count=0;
		if(n%k==0) {
			count=n/k;
		}
		else
			count=n/k+1;
		
		
		System.out.println("Number of pages = "+count);

	}

}
