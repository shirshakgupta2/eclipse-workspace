package hackerRank;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n =scan.nextInt();
		int height=1;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				height*=2;
			}
			else {
				height+=1;
			}
			//System.out.print(height+"  ");
		}
		System.out.println(height);

	}

}
