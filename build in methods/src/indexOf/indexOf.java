package indexOf;
import java.util.*;
public class indexOf {
static int indexOf(String s,char c/*String c*/) {//if user pass two input this will be used
	//char key=c.charAt(0);
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==c)//if(s.charAt(i)==key)
			{
			return i;
		}
		
	}
	
		return -1;
	
} 
static int indexOf(String s,char c/*String c*/,int n) {//if user pass three input this will be used 
	//char key=c.charAt(0);
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==c)//if(s.charAt(i)==key)
			{
			count++;
			if(count==n) {
				return i;
			}
		}
		
	}
	
		return -1;
}
		
	

static int lastIndexOf(String s,char c) {//if user pass three input this will be used 
	//char key=c.charAt(0);
	int count=0;
	for(int i=s.length()-1;i>=0;i--) {
		if(s.charAt(i)==c)//if(s.charAt(i)==key)
			{
			return i;
			}
		}
	return -1;
		
	}


	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		// String c=scan.next();
		char c=scan.next().charAt(0);
		//int n=scan.nextInt();
		//System.out.println(indexOf(s,c));
		System.out.println();
		//System.out.println(indexOf(s,c,n));
		System.out.println(lastIndexOf(s,c));
	}

}
