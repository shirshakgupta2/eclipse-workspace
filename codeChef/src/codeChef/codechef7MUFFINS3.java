//https:www.codechef.com/submit/MUFFINS3
package codeChef;

import java.util.Scanner;

public class codechef7MUFFINS3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		   int t=scan.nextInt();
			while(t-->0){
			    long N=scan.nextLong();
			    long max=0;
			    long left_cupcake=0;
			    if(N!=2) {
			    	left_cupcake=2;
			    }
			    else {
			    	for(long i=1;i<=N;i++){
				        if(N%i!=0){
				            if(max<=N%i){
				                max=N%i;
				                left_cupcake=i;
				            }
				        }
				    }
			    }
			    System.out.println(left_cupcake);
			}
	}
}
