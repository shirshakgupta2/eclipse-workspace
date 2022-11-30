//https://www.hackerrank.com/challenges/repeated-string/problem
import java.util.*;
public class RepeatedString {
	static void repeatingString(String s,int n) {
		int countA=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				countA++;
			}
		}
		int repeat=n/s.length()*countA;
		int extra=n%s.length();
		int count2=0;
		for(int i=0;i<extra;i++) {
			if(s.charAt(i)=='a') {
				count2++;
			}
		}
		System.out.println(repeat+count2);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int n =scan.nextInt();
		repeatingString(s,n);

	}

}
