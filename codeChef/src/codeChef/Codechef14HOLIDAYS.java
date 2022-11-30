package codeChef;

import java.util.Arrays;
import java.util.Scanner;

public class Codechef14HOLIDAYS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
	    int t=scan.nextInt();
	    while(t-->0){
	    int n=scan.nextInt();
	    int A=scan.nextInt();
	    
	    int []a= new int[n];
	    for (int i=0;i<a.length ;i++ ) {
	    	a[i]=scan.nextInt();
	    	
	    }
	    Arrays.sort(a);
	    int max=0;
	    int i=0;
	    for ( i = 0; i < a.length; i++) {
	    	max=a[a.length-i-1]+max;
	    	if(max>=A) {
	    		break;
	    	}
		}
	    System.out.println(a.length-i);
	    
	    }
	    

	}

}