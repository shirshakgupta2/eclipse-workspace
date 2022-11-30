package codeChef;

import java.util.Scanner;

public class codechef9RECNDSTR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		int t=scan.nextInt();
		while(t-->0){
		   String V=scan.next();
		   char[] v =V.toCharArray();
		   char[] L=new char[v.length];
		   char[] R=new char[v.length];
		  
		   L[v.length-1]=v[0];
		   R[0]=v[v.length-1];
		   for (int i = 0; i < L.length-1; i++) {
			   R[i+1]=v[i];
			
		   }
		  
		   for (int i = 1; i < L.length; i++) {
			   L[i-1]=v[i];
			  			   
		   }
//		   for (int i = 0; i < R.length; i++) {
//			System.out.println(R[i]);
//		}
//		   for (int i = 0; i < L.length; i++) {
//			System.out.println(L[i]);
//		}
		   
		   
		   
		   String l=new String(L);
		   String r=new String(R);
		  
		   if(l.equals(r)) {
			   System.out.println("YES");
		   }
		   else {
			   System.out.println("NO");
		   }
		    
		   
		    
		}

	}

}
