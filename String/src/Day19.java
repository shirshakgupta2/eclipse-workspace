import java.util.Scanner;

public class Day19{
	public static int wordCount(String s) {
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(0)==' '||s.charAt(s.length()-1)==' '){
				count=count-1;
			}
			// we can also use trim s=s.trim()
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
			 else if(t.length()>0) {// only else will work for single spaces in between
				 ar[j++]=t;
				 t="";
			 }
		 }
		 
		 ar[j]=t;// if i dont write this then i will not get the last string into the array 
		 return ar;
	}
	public static String reverse(String s) {
		String t="";
		for (int i = s.length()-1;i>=0;i--) {
			t+=s.charAt(i);
		}
		return t;
		
	}
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
    	//String s=scan.nextLine();
		String s="  Tap Academy  ";
		String[] ar=stringToArray(s);
		
		/*System.out.println(ar);*/   //this is not the way to print array by returning through a method
		/*System.out.println(stringToArray (s));*/// this also a wrong way
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
			if(i<ar.length-1) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print((reverse(ar[i])+" "));
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + ar[i].length() );
			if(i < ar.length-1) {
				System.out.print(" "); 
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for (int i = ar.length-1; i >= 0; i--) {
			System.out.print(ar[i] );
			if(i > 0) {
				System.out.println(" ");
			}
		}
	}
}


