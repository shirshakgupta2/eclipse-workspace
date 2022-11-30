import java.util.Scanner;

public class DISTINCTcharSTRING {
	static String distinct(String s) {
		String st="";
		
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				st+="#";
			}
			else {
				st=st+s.charAt(i);
						
			}
			System.out.println(st);
		}
		String replace = st.replace("#","");
		return(replace);
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
//		superReducedString(s);
		System.out.println(distinct(s));

	}

}
