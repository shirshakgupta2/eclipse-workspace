
public class Reversestring {
  static String reverse (String s) {
	  String t="";
	  for(int i=s.length()-1;i>=0;i--) {
		  t=t+s.charAt(i);
	  }
	  return t;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="TAPACADEMY";
        System.out.println(reverse(s));
	}

}
