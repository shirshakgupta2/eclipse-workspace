//https://www.hackerrank.com/challenges/caesar-cipher-1/problem

package hackerRank;

import java.util.Scanner;

public class CAESARCLIPHER {
	static String caesarcipher(String s,String t,int k) {
		k=k%26;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z'-k||s.charAt(i)>='a'&&s.charAt(i)<='z'-k) {
				t=t+(char)(s.charAt(i)+k);
			}
			else if(s.charAt(i)>'Z'-k&&s.charAt(i)<='Z'||s.charAt(i)>'z'-k&&s.charAt(i)<='z') {
				t=t+(char)(s.charAt(i)-26+k);
			}
			else {
				
				t=t+s.charAt(i);
			}
			
		}
		return t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String t="";
		int k=scan.nextInt();
		System.out.println(caesarcipher(s,t,k));

	}

}
