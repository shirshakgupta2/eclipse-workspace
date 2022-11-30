package arrayevening;

import java.util.Scanner;
/* smallest sub array with sum greater than value 
 * 
 */
public class smallestsubArray {
	static void sumofsamllestsubarray(int []a,int value) {
		Scanner scan =new Scanner(System.in);
		
		int k=0,start=0,end=0;
	
		while(k<=a.length) {
		for(int i=0;i<a.length-k-1;i++) {
			int sum=0;
			for(int j=i;j<i+k;j++) {
				start=i;
				 end=j;
			sum+=a[j];
			if(sum>=value) {
					//System.out.println(start);		 
					//System.out.println(end);		 
				for(int n=start;n<=end;n++) {
					System.out.println(a[n]);
				}
				System.exit(0);
			
			}
		}
			//System.out.print(sum);
			//System.out.println();
		
	    }
		k++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("target=");
		
		
		int value=scan.nextInt();
		int n=scan.nextInt();
		
		
		int a[]=new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		//System.out.println(sumofsamllestsubarray(a,k));
		sumofsamllestsubarray(a,value);

	}

}
