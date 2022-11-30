package hackerRank;

import java.util.Scanner;

public class ReducedString {
	
	public static String superReducedString(String s) {
//		String st="";
		StringBuilder sb = new StringBuilder(s);
		for (int i = 1; i < sb.length(); i++) {
			if(sb.charAt(i)==sb.charAt(i-1)) {
				sb.delete(i-1, i+1);
				
				i=0;
			}
			// System.out.println(sb);

		}
		String result=sb.toString();
//		System.out.println(result);
		if(result.isEmpty()) {
			return "Empty String";
		}
		else
			return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		System.out.println(superReducedString(s));

	}

}
