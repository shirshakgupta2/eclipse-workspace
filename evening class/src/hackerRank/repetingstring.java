package hackerRank;

import java.util.Scanner;

public class repetingstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String s =scan.next();
		int n=scan.nextInt();
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='a') {
				count++;
			}
		}
		if(n%s.length()==0) {
			System.out.println(count*(n/s.length())); 
			
		}
		else {
			int temp_count=0;
			for (int i = 0; i < n%s.length(); i++) {
				if(s.charAt(i)=='a') {
					temp_count++;
				}
			}
			System.out.println((count*(n/s.length()))+temp_count);
			
		}
		

	}

}
