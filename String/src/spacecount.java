
public class spacecount {
	static  int CharCount(String s/*,String t*/) {
		int count=0;
		//char key=t.charAt(0);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == 'o') {
				count++;
			}
			}return count;
	}
static  int SpaceCount(String s) {
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i) == ' ') {
			count++;
		}
		}return count;
	
}
static  int WordCount(String s) {
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i) == ' ') {
			count++;
		}
		}return count+1;
	
}
static int wordCount(String st){
	int count=0;
	for(int i=0;i<st.length();i++) {
		if(st.charAt(0)==' '||st.charAt(st.length()-1)==' '){
			count=count-1;
		}
		if(st.charAt(i) == ' '&&st.charAt(i+1)!=' ') {
			count++;
		}
	}
	return count+1;
}

public static void main(String[] args) {
	String s="How are you";
	String st="  How   are   you  ";
	//String t="o";
	System.out.println(SpaceCount(s));		
	System.out.println(WordCount(s));		
	System.out.println(wordCount(st));		
	System.out.println(CharCount(s/*,t*/));		
}
}

