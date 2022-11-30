package hackerRank;

import java.util.Iterator;

public class Prime {

	public static void main(String[] args) {
		int sum=0,j=1;
		for (int i=1;i<=100;i++) {
			for ( j=2;j<=i;j++) {
				if(i%j==0) {
					
					break;
				}
				}
			if(i==j) {
				System.out.println(sum+=i);
				
			}
		}
		//System.out.println(sum);
		/*int []a=new int[100];
		for (int i=0;i<100;i++) {
			a[i]=i+1;
		}
		for (int i=0;i<100;i++) {
			System.out.println(a[i]);
		}
		for(int i=0;i<100;i++) {
			for (int j=1;j<=a[i];j++) {
				if(a[i]%j==0 ) {
					if(j==1||j==a[i]) {
						
					}
					else break;
				}
			}
		}*/

		
	}

}
