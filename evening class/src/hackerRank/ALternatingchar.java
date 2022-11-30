package hackerRank;

import java.util.Scanner;

public class ALternatingchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String s =scan.next();
		int count=0;
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i)=='A') {
				if(s.charAt(i+1)=='A') {
					count++;
				}
			}
			if(s.charAt(i)=='B') {
				if(s.charAt(i+1)=='B') {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
