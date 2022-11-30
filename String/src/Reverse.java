import java.util.Scanner;

public class Reverse {
	public static int wordCount(String s) {
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(0)==' '||s.charAt(s.length()-1)==' '){
				count=count-1;
			}
			
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' '){
				count++;
			}
			
		}
		return count+1;
	}
	public static String[] stringToArray(String s){
		
		// s =s.trim();
		 int wordCount=wordCount(s);
		 String[] ar=new String[wordCount];
		 String t="";
		 int j=0;
		 for(int i=0;i<s.length();i++) {
			 if(s.charAt(i)!=' ') {
				 t=t+s.charAt(i);
			 }
			 else if(t.length()>0) {
				 ar[j++]=t;
				 t="";
			 }
		 }
		  ar[j]=t; 
		 return ar;
	}
	public static String reverse(String s) {
		String t="";
		for (int i = s.length()-1;i>=0;i--) {
			t+=s.charAt(i);
		}
		return t;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String s=scan.nextLine();
		String[] ar=stringToArray(s);
		for (int i = 0; i < ar.length; i++) {
			System.out.print((reverse(ar[i])+" "));
			
		}
		
	}
}
