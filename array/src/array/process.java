package array;

import java.util.Scanner;

public class process {
	static void  processArray(int []a){
		for(int i=0;i<a.length;i++){
			if(a[i]%4==0&&a[i]%10==6) {
				System.out.println("-3");
			}
			else if(a[i]%4==0) {
				System.out.println("-2");
			}
			else if(a[i]%10==6) {
				System.out.println("-5");
			}
			else {
				System.out.println(a[i]);
			}
		}
		

		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[] =new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
        processArray(a);

	}

}
