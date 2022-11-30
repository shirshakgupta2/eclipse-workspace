package toCharArray;

import java.util.Scanner;

public class toCharArray {
static char[] toCharArray(String s) {
	char a[]=new char[s.length()];
	for(int i=0;i<s.length();i++) {
		a[i]=s.charAt(i);
	}
	return a;
}
static boolean equals(String s1,String s2) {
	int count=0;
	int i=0;
	int j=0;
	if(s1.length()!=s2.length()) {
		return false;
	}
	
	else if(s1.length()==s2.length()) {
	while(i<s1.length()&&j<s2.length()) {
		if(s1.charAt(i)!=s2.charAt(j)) {
			return false;
			}
		i++;
		j++;
	}
	}
	return true;
}
static String replace(String s,char  old_char,char new_char ) {
	char ar[]=toCharArray(s) ;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==old_char) {
			ar[i]=new_char;
			}
		}
		/*return ar;*/ //it is an array so we are not suppose to return an array we have to return a String
        return new String(ar);  	//THIS CHNAGES CHARACTER ARRAY TO A STRING BY CALLING JVM
                                    // THIS IS AN ANAOTHER WAY TO WRITE A STRINGIN TERMS OF CHARACTER ARRAY 
}
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//String s=scan.nextLine();
		//String s1=scan.nextLine();
		//  String s2=scan.nextLine();
	      String s=scan.nextLine();
		char old_char=scan.next().charAt(0);//
		char new_char=scan.next().charAt(0);
		//System.out.println(equals(s1,s2) )  ;
		System.out.println(replace(s,old_char,new_char) )  ;
	}

}
