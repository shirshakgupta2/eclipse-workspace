package codeChef;

import java.util.Scanner;

public class codechef6ODDNUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	   int t=scan.nextInt();
		
		while(t-->0){
		     long n=scan.nextLong();
		    if(n%2==0){
		        System.out.println((n/2)*(n/2)*2);
		    }
		    else{
		        System.out.println((((n+1)/2)*(((n+1)/2))*2)-((n+1)/2)*2);
		    }
		   
		}

	}

}
