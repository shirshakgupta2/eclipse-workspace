package arrayevening;
import java.util.Scanner;

/*LONGEST INCRESING CONSECUTIVE SUB ARRAY*/
public class subarray {
	public static void main (String []args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
			}
	/*	int count=0,long_sub=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i+1]-a[i]==1) {
				count++;
			}
			if(count>long_sub) {
				long_sub=count;
			}
			
		}*/
		int tstart=0,tend=0,start=0,end=0;
		for (int i = 0; i < a.length; i++) {
			//for (int i = 0; i < a.length-1; i++) {
			if(i<a.length-1) {
			if(a[i+1]-a[i]==1) {
			    tend++;
			}
			else {
				if(end-start<tend-tstart) {
				start=tstart;
				end=tend;
				}
				
				tstart=i+1;
				tend=i+1;
			}
			} 
			
		    
		}
		System.out.println(tstart);
		System.out.println(tend);
		System.out.println(start);
		System.out.println(end);
		for (int i = start; i <= end; i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
