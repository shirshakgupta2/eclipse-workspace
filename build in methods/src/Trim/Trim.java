package Trim;

import java.util.Scanner;

public class Trim {
	/*static String trim(String s) {
	int si=0;
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' ') {
			 si=i;
			break;
		}
	}
	int ei=0;
	for(int j=s.length()-1;j>=0;j--) {
		if(s.charAt(j)!=' ') {
			 ei=j;
			break;
		}
	}
	String t="";
		for(int i=si;i<=ei;i++) {
		t=t+s.charAt(i);
		}
return t;
}*/
	static String trim (String s) {
		String t="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ')
				{
				t=t+s.charAt(i);
				}
			}
		return t;
		
	}
	static boolean startsWith(String s,String st) {
		//char c[]=st.toCharArray();
		int c=0;
		if(st.length()<=s.length()) {
		for(int i=0;i<st.length();i++) {
			if(s.charAt(i)==st.charAt(i)) {
				c++;
				if(c==st.length()) {
					return true;                             //my method
				}
			}
			else
				return false;
			
		}
		}
		
			return false;
		
	
	}
	
	/*static boolean startsWith(String s,String st) {
		int count=0;
		for(int i=0;i<st.length();i++) {                              //sir method 
			if(s.charAt(i)==st.charAt(count)) {
				count++;
			}
		}
		if(st.length()==count) {
			return true;}
		else
			return false;
		}*/
	
	
	static boolean endsWith(String s,String st) {
		//char c[]=st.toCharArray();
		int c=0;
		int n=0;
		if(st.length()<=s.length()) {
		for(int i=s.length()-st.length()/*s.indexOf(st.charAt(0))*/;i<s.length();i++) {
			while(n<st.length()) {
				if(s.charAt(i)==st.charAt(n)) {                   //my method
			
				c++;
				n++;
				if(c==st.length()) {
					return true;
				}
			}
			else
				return false;
				
			
		}
		}
		}
			return false;
		
	
	}
	
	static boolean contains(String s,String st) {
		int count=0;
		for(int i=0;i<s.length()&&count<st.length()/*imp point*/;i++) {// count will go out of bound
			if(s.charAt(i)==st.charAt(count)) {                        //afterincrementation in the last of the loop
				count++;
			}
			else {
				count=0;
			}
		}
		if(st.length()==count) {
			return true;}
		else
			return false;
		
	
	}
	
	
	
	
		
			public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			String s=scan.nextLine();
		    String st=scan.nextLine();
			
			
			
			//System.out.println(trim(s));
			//System.out.println(startsWith(s,st));
			System.out.println(endsWith(s,st));
			System.out.println(contains(s,st));
		}

}
