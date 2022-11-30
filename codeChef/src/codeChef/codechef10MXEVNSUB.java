package codeChef;

import java.util.Scanner;

public class codechef10MXEVNSUB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
        int t=scan.nextInt();
		while(t>0){
		    int n =scan.nextInt();
		    for(int i=n;i>0;i--){
		        int sum=(i*(i+1))/2;
//		        System.out.println(sum);
		        if(sum%2==0){
		            System.out.println(i);
		            break;
		        }
		    }
		    t--;
		}

	}

}

