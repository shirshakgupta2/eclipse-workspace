package hackerRank;

import java.util.Scanner;

public class FinalDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		// rem=
		int x=n;
		int count=0;
		while(x>0) {
			int rem=x%10;
			
			if(rem!=0&&n%rem==0) {
				count++;
			}
			x=x/10;
		}
		System.out.println(count);

	}

		
}
