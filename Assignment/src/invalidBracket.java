import java.util.Scanner;
public class invalidBracket {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int open_brack=0;
		int close_brack=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				open_brack++;
			}
			else if(s.charAt(i)==')') {
				if(open_brack>=1) {
					open_brack--;
				}else{
					close_brack++;
				}
			}
		}
		System.out.println(open_brack+close_brack);
	}
}