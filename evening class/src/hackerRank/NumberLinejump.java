package hackerRank;

import java.util.Scanner;

public class NumberLinejump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int x1=scan.nextInt();
		int v1=scan.nextInt();
		int x2=scan.nextInt();
		int v2=scan.nextInt();
		int newX1=x1;
		int newX2=x2;
		if(v1<v2) {
			System.out.println("NO");
		}
		else {
			while(newX1<newX2) {
				newX1=newX1+v1;
				newX2=newX2+v2;
				if(newX1==newX2) {
					//return("yes");
					System.out.println("Yes");
					
				}
				
			}
			System.out.println( "NO");
			
		}
			
			
		
		

	}

}
