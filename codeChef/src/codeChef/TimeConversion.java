//https://www.hackerrank.com/challenges/time-conversion/problem

package codeChef;
import java.util.Scanner;
public class TimeConversion {
	static void AMTOPM(String s) {
		String res="";
		if(s.charAt(8)=='P') {
			//int x=Integer.parseInt(s);  this is used to convert string to integer
			//	String a[]=s.split(s:);
				String t=""+s.charAt(0)+s.charAt(1);
				System.out.println(t);
				
				if(t.equals("12")) {
					res+="12";
				}
				else {
					// res="";
				    res=res+(Integer.parseInt(t)+12);
				}
				res+=s.substring(2,8);
				
			}
			else {
				String t="";
				
				t=t+s.charAt(0)+s.charAt(1);
				System.out.println(t);
				
				if(t.equals("12")) {
					res+="00";
					System.out.println(res);
				}else {
					res=t;
				}
				res+=s.substring(2,8);
			}
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		AMTOPM(s);
		

	}

}
