package array;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Scanner;

public class arrayswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int []a= {1,0,1,1,0,1,0,1};
	/*	for(int i=0;i<a.length-1&&a[i]!=1;i++) {
			for (int j = a.length-1; a[j]!=0&&j >0; j--) {
				if(a[i]==1&&a[j]==0) {
					//int temp=0;
					int temp=a[i];
					a[j]=a[i];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a);
		}
		*/
		int i=0,j=a.length-1;
		while(i<j) {
		while(a[i]!=1) {
			i++;
		}
		while(a[j]!=0) {
			j--;
		}
		if(i<j) {
			int temp=a[i];
			a[j]=a[i];
			a[j]=temp;
			
		}
		}
		for ( i = 0; i < a.length-1; i++) {
			System.out.println(a[i]);
		}
		

	}

	

}
