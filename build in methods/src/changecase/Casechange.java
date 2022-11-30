package changecase;
	import java.util.*;

	public class Casechange {
		static String toUpperCase(String s) {
			String t="";
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)>='a'&&s.charAt(i)<='z') {  //this is for only changing the lower case char not others
				t=t+(char)(s.charAt(i)-32);}// type casting is imp 
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
		static String toSwapCase(String s) {
			String t="";
			for(int i=0;i<s.length();i++) {
				//if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				if(s.charAt(i)>='a'&&s.charAt(i)<='z') {  //this is for only changing the lower case char not others
				t=t+(char)(s.charAt(i)-32);}// type casting is imp 
			else if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				t=t+(char)(s.charAt(i)+32);}
				
		//	}
			
			else {
				t=t+s.charAt(i);
			}}
			return t;
		}
		static String toReplaceUpperCase(String s) {

			String t="";
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)>='a'&&s.charAt(i)<='z') {  //this is for only changing the lower case char not others
				t=t+"#";}// type casting is imp 
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
			System.out.println(toSwapCase(s));
			System.out.println(toReplaceUpperCase(s));
			
			}
		}



