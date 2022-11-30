//https://www.codechef.com/submit/TLG
package codeChef;

import java.util.Arrays;
import java.util.Scanner;

public class codechef2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int a[][]=new int [n][2];
		int b[][]=new int [n][2];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=scan.nextInt();
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				if(j==0) {
					if(a[i][j]>a[i][j+1]) {
						b[i][j]=1;
						b[i][j+1]=a[i][j]-a[i][j+1];
					}
					else {
						b[i][j]=2;
						b[i][j+1]=a[i][j+1]-a[i][j];
					}
				}
				
			}
			
		}
		
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		int max=0;
		for (int i = 0; i < b.length; i++) {
			if(b[i][1]>max) {
				max=b[i][1];
			}
		}
		System.out.println(max);
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			if(b[i][1]==max) {
				System.out.println(b[i][0]+" "+max);
				System.exit(0);
			}
		}
		
		
		

	}

}
