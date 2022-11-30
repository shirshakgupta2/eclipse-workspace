package arrayevening;
import java.util.Scanner;

public class maxinSubarray {
	static void maxineverSubarray(int a[],int k){
		int max=0;
		for(int i=0;i<=a.length-k;i++) {
			for(int j=i;j<i+k;j++) {
				System.out.print(a[j]+" ");
				if(a[j]>max) {
					max=a[j];
					
				}
			}
			System.out.println("max="+max);
			max=0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int k=scan.nextInt();
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		maxineverSubarray( a,k);

	}

}
