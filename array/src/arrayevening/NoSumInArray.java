package arrayevening;
// which two no.s in an array that will give the sum as n
import java.util.Scanner;
import java.util.*;
public class NoSumInArray {
	static void twonosinarrayhasSumas(int a[]) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i;j<=a.length-1;j++) {
				if(i!=j) {
					if(a[i]+a[j]==n){
						System.out.println(a[i]+" "+a[j]);
					}                     
				}
			}
		}
	}
/*  ## 	print the no.s in an array that has sum equal to the given no.
*/	
	static void OneLessNosThatHaveMaxSumAndMinSum(int a[]) {
		int sum_all=0;
		for (int i = 0; i < a.length; i++) {
			sum_all+=a[i];
		}
		int max_Sum=0,min_Sum=0;
		int min =a[0];
		int k=0;
		for (int i = 0; i < a.length; i++) {
		    	if(min>a[i]) {
				min=a[i];
			    }
		    }
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		max_Sum=sum_all-min;
		min_Sum=sum_all-max;
		System.out.println(max_Sum+" "+min_Sum);
	}
/*	## we have to print max sum of array leaving the min num 
 * and print min sum of array leaving max no.
*/
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int k=scan.nextInt();
		int a[]=new int[k];
		for(int i=0;i<=a.length-1;i++) {
			a[i]=scan.nextInt();
		}
		twonosinarrayhasSumas(a);
		OneLessNosThatHaveMaxSumAndMinSum(a);
	}

}
