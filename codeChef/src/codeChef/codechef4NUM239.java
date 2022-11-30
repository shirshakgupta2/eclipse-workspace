//https://www.codechef.com/submit/NUM239
package codeChef;

import java.util.Scanner;

public class codechef4NUM239 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		int t=scan.nextInt();
		while(t-->0){
		    int count=0;
		    int L=scan.nextInt();
		    int R=scan.nextInt();
		    for (int i=L;i<=R ;i++ ){
		        if(i>=10) {
		        	if(i%10==2||i%10==3||i%10==9){
			            count++;
			        }
		        }
		        else if(i==2||i==3||i==9){
		        	count++;
		        }
		    } 
		    System.out.println(count);
		}

	}

}
