import java.util.*;
public class Palindrome// level,malayalam
{ static Boolean isPalindrome( String s) { 
	String t= Reversestring.reverse(s);
	if(s.equals(t)) {
		return true;
	}else {
		return false;
	}
}
static Boolean isPalindrome2( String t) {
     int i=0;
     int j=t.length()-1;
     while(i<=j) {
    	 if(t.charAt(i)!= t.charAt(j)) {
    		 return false;
    	 }
    	 i++;
    	 j--;
     }
     return true;
     }
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		// TODO Auto-generated method stub
      // String s=new String("level");
      // String t=new String("abccba");
		String s=scan.next();
		String t=scan.next();
      System.out.println(isPalindrome(s));
      System.out.println(isPalindrome2(t));
      
       
	}

}
