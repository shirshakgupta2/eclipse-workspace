import java.util.*;
public class Devuandfrien {
public static void main(String args[]) {
	int count =0;
	Scanner scan=new Scanner(System.in);
	int t=scan.nextInt();
	while(t>0) {
	int n=scan.nextInt();
	int a[]=new int[n];
	for(int i=0;i<a.length;i++) {
		a[i]=scan.nextInt();
		}
	//Sorting.selectionSort(a);// it has to be in the same package
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
		}
	System.out.println();
	for(int i=0;i<a.length-1;i++) {
		if(a[i]!=a[i+1]) {
			count++;
		}
		}
	System.out.println(count+1);
	t--;
	}
	
}
}
