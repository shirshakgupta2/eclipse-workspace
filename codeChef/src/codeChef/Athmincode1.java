package codeChef;

import java.util.Iterator;
import java.util.Scanner;

public class Athmincode1 {
	static String columnname(int n) {
		char a[]=new char[13];
		int i=0;
		char c='A';
		while(i<13) {
			a[i]=(char)(c+2*i);
			i++;
		}
//		for (int j = 0; j < a.length; j++) {
//			System.out.println(a[j]);
//		}
		String s="";
		if(n<14) {
			return (s+(a[n-1]));
		}
		else if(n%13==0) {
			for (int j = 0; j <(n/13)-1; j++) {
				s+=a[0];
			}
			return(s+a[12]);
		}
		else {
			int rem =n%13;
			for (int j = 0; j <n/13; j++) {
				s+=a[0];
			}
			//System.out.println(rem);
			return(s+a[rem-1]);
		}
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(columnname(n));
		
		
	}

}
