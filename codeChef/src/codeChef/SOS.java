package codeChef;

import java.util.Scanner;

public class SOS {
	static void  SOS(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='S') {
				i++;}
			else 
				count++;i++;
			if(s.charAt(i+1)=='O') {
				
			}else 
				count++;i++;
			if(s.charAt(i+2)=='S') {
				i++;
			}else
				count++;;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		SOS(s);

	}

}
