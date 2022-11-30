package codeChef;

import java.util.Arrays;
import java.util.Scanner;

public class decresingdiff {
	static boolean decdiff(int a[]) {
		int i=0,diff=0;
		int b[]=new int[a.length-1];
		while(i<a.length-1) {
			if(a[i]<a[i+1]) {
				diff=a[i+1]-a[i];
				
			}
			else {
				diff=a[i]-a[i+1];
			}
			b[i++]=diff;
		}
		for (int j = 0; j < b.length; j++) {
			if(j<b.length-1) {
			if(b[j]<=b[j+1]) {
				return false;
			}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();  	
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		}
		System.out.println(decdiff(a));
		
	
		

	}

}
