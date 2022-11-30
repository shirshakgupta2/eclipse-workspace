package codeChef;

import java.util.Arrays;
import java.util.Scanner;

class Chefandeid{
	int []a;
    public Chefandeid(int[] a) {
		this.a = a;
	}
	void ChefandEid(){
//        for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
        Arrays.sort(a);
        int min_diff=100000;
        for (int i = 0; i < a.length-1; i++) {
			if((a[i+1]-a[i])<min_diff) {
				min_diff=(a[i+1]-a[i]);
				
			}
		}
        System.out.println(min_diff);
    }
}
public class codechef12EID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
	    int t=scan.nextInt();
	    while(t-->0){
	    int n=scan.nextInt();
	    int []a= new int[n];
	    for (int i=0;i<a.length ;i++ ) 
	        a[i]=scan.nextInt();
	    Chefandeid cie=new Chefandeid(a);
	    cie.ChefandEid();
	    }

	}

}
