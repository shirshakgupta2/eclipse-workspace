import java.util.Scanner;

public class mississippi {
	static void CountOfDiffWordwithword(String s) {
		char a[]=s.toCharArray();
		int count=0;
		String t=printeveryWords(s);
		for (int i = 0; i < t.length(); i++) {
			for (int j = 0; j < a.length; j++) {
				if(t.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			System.out.println(t.charAt(i)+""+count);
			count=0;
		}
	}
	static void NoOfPairs(String s) {
		int pairs=0;
		int count=0;
		String t=printeveryWords(s);
		for (int i = 0; i < t.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if(t.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			pairs=pairs+count/2;
			count=0;
		}
		System.out.println(pairs);
	}
	static String printeveryWords(String s) {
		String t="";
		for (int i = 0; i < s.length(); i++) {
				if(t.indexOf(s.charAt(i))==-1){
						t=t+s.charAt(i);
					}
			}
		return t;
	}
	static void wordsInPairs(String s) {
		int count=0;
		String t=printeveryWords(s);
		for (int i = 0; i < t.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if(t.charAt(i)==s.charAt(j)) {
					count++;
				}
				if(count>2) {
					System.out.println(t.charAt(i)); 
					
					break;
				}
			}
			count=0;
		}
	}
	void AllNonRepatingChar() {
		
	}
	static void AllrepetingChar(String s) {
		int count=0;
		String t=printeveryWords(s);
		for (int i = 0; i < t.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if(t.charAt(i)==s.charAt(j)) {
					count++;
					
				}
				if(count>2) {
					System.out.println(t.charAt(i)); 
					
					break;
				}
			}
			count=0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s="mississippi";
		CountOfDiffWordwithword(s);
		System.out.println(printeveryWords(s));
		//System.out.println(wordsInPairs(s));
		wordsInPairs(s);
		NoOfPairs(s);

	}

}
