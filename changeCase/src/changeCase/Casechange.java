package changeCase;
import java.util.*;

public class Casechange {
	static String toUpperCase(String s) {
		String t="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
			t=t+(char)(s.charAt(i)-32);}
		else {
			t=t+s.charAt(i);
		}
		}
		return t;
	}
	static String toLowerCase(String s) {
		String t="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
			t=t+(char)(s.charAt(i)+32);}
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
		System.out.println(toUpperCase(s));
		System.out.println(toLowerCase(s));
		}
	}

