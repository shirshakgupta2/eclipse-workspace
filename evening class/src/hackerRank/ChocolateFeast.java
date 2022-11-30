package hackerRank;

import java.util.Scanner;

public class ChocolateFeast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		int c=scan.nextInt();
		int m=scan.nextInt();
		int new_wrap=0;
		int count=n/c;
		int noofwrap=n/c;
		while(noofwrap>=m) {
			if(noofwrap%m==0) {
				noofwrap=noofwrap/m;
				count=count+noofwrap;
				
			}
			else {
				count=count+noofwrap/m;
				noofwrap=noofwrap/m+noofwrap%m;
				
			}
		}
		System.out.println(count);
		

	}

}
