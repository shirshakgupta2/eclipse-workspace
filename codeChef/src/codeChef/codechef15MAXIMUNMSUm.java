package codeChef;

import java.util.Scanner;

public class codechef15MAXIMUNMSUm {

	public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return (gcd(b,a%b));
    }
     public static int lcm(int a,int b,int gcdValue){
         return Math.abs(a*b)/gcdValue;
     }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0){
		    int n=scan.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<a.length-1;i++){
		         a[i]=scan.nextInt();
		    }
		    for(int i=0;i<a.length-1;i++){
		        int gcdValue=gcd(a[i],a[i+1]);
		        a[i]=gcdValue;
		        int lcmValue=lcm(a[i],a[i+1],gcdValue);
		        a[i+1]=lcmValue;
		    }
		    int sum=0;
		    for(int i=0;i<a.length;i++){
		        sum+=a[i];
		    }
		    System.out.println(sum);
		        
		    
		    
		}

}
