package codeChef;

import java.util.Scanner;

public class codechef10VACCINE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan= new Scanner(System.in);
        int t=scan.nextInt();
		while(t-->0){
			int n=scan.nextInt();
			int d=scan.nextInt();
			int []a=new int[n];
			for(int i =0;i<a.length;i++){
			    a[i]=scan.nextInt();
			}
			
			int Risk=0,No_Risk=0;
			for(int i =0;i<a.length;i++){
			    if(a[i]>=80 || a[i]<=9) {
			    	Risk++;
			    }
			    else {
			    	No_Risk++;
			    }
			}
            int total_days=0;
			
			if(Risk%d==0) {
			    total_days=Risk/d;
			}
			else{
			    total_days=Risk/d+1;
			}
			if(No_Risk%d==0) {
			    total_days=total_days+No_Risk/d;
			    
			}
			else{
			    total_days=total_days+No_Risk/d+1;
			}
			System.out.println(total_days);
			
			
		}
	}

}
