import java.util.Scanner;

// count no of vowels ,consonents,numeric and special
public class countvariables {
	static void counting(String s) {
		int vc=0,cc=0,nc=0,sc=0;
		for (int i=0;i<s.length();i++) {
			 char ch=s.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'
					||ch=='O'||ch=='u'||ch=='U') {
				vc++;
			}
			else if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
				cc++;
			}
			else if(ch>='0'&&ch<='9') {
				nc++;
			}
			else {
				sc++;
			}
		}
		System.out.println(vc+" "+cc+" "+nc+" "+sc);
	}
	
	static String getspecialchar(String s) {
		String t="";
		for (int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')
					||(ch>='0'&&ch<='9'))) {
				t=t+ch;
			}
		}
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		String s=scan.nextLine();
		counting(s);
		System.out.println(getspecialchar(s));

	}

}
