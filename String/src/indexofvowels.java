import java.util.Scanner;

public class indexofvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		for (int i = 0; i < s.length(); i++) {
			char c= s.charAt(i);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||
					c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				System.out.println(i);
			}
		}

	}

}
