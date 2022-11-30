package subString;
import java.util.*;
public class substring {
static String substring(String s,int startIndex) {
	String t="";
	for(int i=startIndex;i<s.length();i++) {
		t=t+s.charAt(i);
	}
	return t;
}
static String substring(String s,int startIndex,int endIndex) {
	String t="";
	for(int i=startIndex;i<endIndex;i++) {
		t=t+s.charAt(i);
	}
	return t;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);
	String s=scan.nextLine();
	int startIndex=scan.nextInt();
	int endIndex=scan.nextInt();
	System.out.println(substring(s,startIndex,endIndex));
	System.out.println(substring(s,startIndex));

	}

}
