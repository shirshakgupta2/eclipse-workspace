import java.util.Scanner;

public class pangram //string that contains all 26 alphabets 
{
	static boolean isPangram(String s,String t) {
	s=s.toLowerCase();
	int count=0;
	for(int i=0;i<t.length();i++) {
		if(s.indexOf(t.charAt(i))>=0) {
			count++;
		}
		else
			break;
	}
	 if(count==26)
		 return true;
	 else
		 return false;
	}
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t="abcdefghijklmnopqrstuvwxyz";
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		System.out.println(isPangram(s,t));

	}

}
