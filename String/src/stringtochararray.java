
public class stringtochararray {
static String swapArray(String s) {
	char[]c=s.toCharArray();
	//int i=0,j=c.length;//c.length() is not there becoz it is not a met
                      //it is a variable
	//while(i<=j)
	for(int i=0,j=c.length-1;i<=j;i++,j--) {
		char temp=c[i];
		c[i]=c[j];
		c[j]=temp;
		//i++;
		//j--;
	}
/*for(i=0;i<=c.length;i++) {
	c[i];
}*/
return new String(c);// creating string thorugh the character array
}
static void printAllSubString(String st) {
	for(int len=1;len<=st.length();len++) {
		for(int s=0;s<=(st.length()-len);s++) {
			for(int e=s;e<=(s+len)-1;e++) {
				System.out.print(st.charAt(e));
			}System.out.println();
		}
		
	}
	
}
static void printkNoSubString(String st,int k) {

		for(int s=0;s<=(st.length()-k);s++) {
			for(int e=s;e<=(s+k)-1;e++) {
				System.out.print(st.charAt(e));
			}
			System.out.println();
		}
		
	
	
}
 
	public static void main(String[] args) {
	String st="abcde";
	System.out.println(st);
	st=swapArray(st);
	//String c=swapArray(s);
    System.out.println(st);
	//printAllSubString(st);
	//printkNoSubString(st,3);
	}

}
