
public class stringconcatwithspaces {
	static String concatwithspace(String s) {
		int si=0,ei=0;String t="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				si=i;
				break;
			}
		}
		for(int j=s.length()-1;j>=0;j--) {
			if(s.charAt(j)!=' ') {
				ei=j;
				break;
			}
		}
		for(int i=si;i<=ei;i++) {
			t+=s.charAt(i);
		}
		return t;
		
	}
	static String TRIM(String s) {
		s=s.trim();
		return s;
		
	}
	
	public static void main(String[] args) {
	String	s="      1How   are   you2  ";
		//String t="o";
		System.out.println(concatwithspace(s));
		System.out.println(TRIM(s));
	}
}
