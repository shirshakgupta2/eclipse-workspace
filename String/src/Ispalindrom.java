import java.util.Scanner;

public class Ispalindrom {
	static String isPalindrome( String t) {
	     int i=0;
	     int j=t.length()-1;
	     while(i<=j) {
	    	 if(t.charAt(i)!= t.charAt(j)) {
	    		 return "no";
	    	 }
	    	 i++;
	    	 j--;
	     }
	     return "yes";
	     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String t=scan.next();
		System.out.println(isPalindrome(t));

	}

}
