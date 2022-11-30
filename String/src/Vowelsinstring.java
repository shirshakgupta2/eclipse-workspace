
public class Vowelsinstring {
	static int countVowel( StringBuffer st) { 
	int count=0;
	 for(int i=0;i<st.length();i++) {
		char c= st.charAt(i);
		if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||
				c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			count++;
		}
		
	 }
	 return count;
	}
	public static void main(String[] args) {
		StringBuffer st=new StringBuffer();
		 st.append(" javascript");
		 System.out.println(countVowel(st));
	}
	

}
