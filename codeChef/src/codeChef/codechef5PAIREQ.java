//www.codechef.com/submit/PAIREQ
package codeChef;

import java.util.Arrays;
import java.util.Scanner;

public class codechef5PAIREQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		int t=scan.nextInt();
		while(t-->0){
			int n=scan.nextInt();
			int a[]=new int[n];
			for(int i=0;i<a.length;i++){
			    a[i]=scan.nextInt();
			}
			System.out.println();
			Arrays.sort(a);
			
			int count=1;
			int max=0;
//			for (int i = 0; i < a.length; i++) {
//				if(i<a.length-1) {
//					if(a[i]==a[i+1]) {
//						count++;
//					}
//					else {
//						System.out.print(count+"  ");
//						count=1;
//					}
//				}
//				else {
//					System.out.println(count);
//				}
//			}
			for (int i = 0; i < a.length; i++) {
				if(i<a.length-1) {
					if(a[i]==a[i+1]) {
						count++;
					}
					else {
						if(max<=count){
							max=count;
							//System.out.print(count+"  ");
							
						}
						count=1;
						
					}
					
				}
				else {
					//System.out.println();
					if(max<=count){
						max=count;
					}
					
				}
			}
			System.out.println(n-max);
		}
	}
}
/*
 *
 * 1
13 
1 2 3 3 3 3 4 4 5 6 7 8 8
 * */
