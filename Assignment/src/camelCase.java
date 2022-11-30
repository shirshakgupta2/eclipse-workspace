
import java.util.*;
public class camelCase {
	static int camelCase(String s) {
		int count=1;
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
			count++;
		}
	}
		return count;
	}
	static int space(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==' ') {
			count++;
			//System.out.println(count);
		}
		
	}
		return count;
	}
	
public static void main(String []args) {
	Scanner scan=new Scanner(System.in);
	String s=scan.nextLine();
	
	//System.out.println(camelCase(s));
	System.out.println(space(s));
	
}
}
