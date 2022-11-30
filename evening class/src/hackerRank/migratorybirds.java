package hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class migratorybirds {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n =scan.nextInt();
		
		ArrayList<Integer> arr=new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			arr.add(scan.nextInt());
		}
		
		int []a=new int [6];
	    for(int i=1;i<=5;i++){
	        int count=0;
	        for(int j=0;j<arr.size();j++){
	            if(arr.get(j)==i){
	                count++;
	            }
	        }
	        a[i]=count;
	    
	    }
	    for(int i=0;i<a.length;i++) {
	    	//System.out.println("ages are");
	    	System.out.println(a[i]);
	    }
	    int max=0;
	    for (int i = 0; i < a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
	    System.out.println(max);
	    for (int i = 0; i < a.length; i++) {
			if(a[i]==max) {
				System.out.println(i);
			}
		}
		
	}

}
