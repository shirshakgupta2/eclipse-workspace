package arrayevening;
import java.util.Arrays;
import java.util.Scanner;

public class missingno {
	static int smallestpositivemissing(int a[]) {
		Arrays.sort(a);
		int count=1;
		int res=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				
				if(a[i]!=count) {
					 res=count;
					break;
				}else {
					count++;
				}
			}
		}
		return res;
	}
	/*static int smallestpositivemissinglinearserch(int a[]) {
		int count=1,res=1;
		for(int i=1;i<=a.length;i++) {
		if(lSearch(a,count)==-1) {
			 res= count;
			// System.out.println(res);
			 return res;
			 break;
		}
		count++;
			
		}
		return -1;
	}*/
	static void missingno(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if(i<a.length-1) {
				if(a[i+1]-a[i]!=1) {
					System.out.println(a[i]+1);
				}
			}
		}
	}
	
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println(smallestpositivemissing( a));
		missingno(a);
		//System.out.println(smallestpositivemissinglinearserch(a));
        
		System.out.println(Arrays.binarySearch(a,3));
	}

}
