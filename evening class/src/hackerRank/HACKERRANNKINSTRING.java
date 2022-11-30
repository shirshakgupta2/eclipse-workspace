//https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem


package hackerRank;

import java.util.Scanner;

public class HACKERRANNKINSTRING {
	static String hackerrankinstring(String s,String t) {
		int i=0,j=0;
		while( i < t.length()) { 
			while( j < s.length()&&i<t.length()){
				if(s.charAt(j)==t.charAt(i)) {
					i++;j++;
				}else {
					j++;
				}
			}
			if (i==t.length()) {
				return "YES";
			}
		}
		return "NO";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String t="hackerrank";
		System.out.println(hackerrankinstring(s,t));

	}

}
