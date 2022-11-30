package arrayevening;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayfrequency {

	static void  simpleArraySum(ArrayList al){
	    int sum=0;
	    for(int i=0;i<=al.size()-1;i++) {
			sum+=(int)al.get(i);
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {

		//Write your code here	
		Scanner scan=new Scanner(System.in);
		ArrayList al = new ArrayList();
		while(scan.hasNextInt()) {
		 al.add(scan.nextInt());
		}
		simpleArraySum(al);
//		Scanner scan=new Scanner(System.in);
//		int k=scan.nextInt();
//		int a[]=new int[k];
//		int count=0;
//		int n=scan.nextInt();
//		for(int i=0;i<=a.length-1;i++) {
//			a[i]=scan.nextInt();
//		}
//		for(int i=0;i<=a.length-1;i++) {
//			if(a[i]==n) {
//				count++;
//			}
//		}
//		System.out.println(count);
		

	}

}
