package codeChef;

import java.util.Scanner;

public class codechef8WEIGHTBL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		   int t=scan.nextInt();
			while(t-->0){
			    int w1=scan.nextInt();
			    int w2=scan.nextInt();
			    int x1=scan.nextInt();
			    int x2=scan.nextInt();
			    int M=scan.nextInt();
			    int dif=w2-w1;
			    if(dif>=x1*M&&dif<=x2*M){
			        System.out.println("1");
			    }
			    else{
			        System.out.println("0");
			    }
			}

	}

}
