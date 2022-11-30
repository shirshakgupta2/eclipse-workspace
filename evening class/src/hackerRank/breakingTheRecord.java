package hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class breakingTheRecord {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n =scan.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			a.add(scan.nextInt());
		}
		int min_record=(int)a.get(0);
	    int max_record=(int)a.get(0);
	    int countmax=0;
	    int countmin=0;
	    //Object[]a=scores.toArray();
	    for(int i=1;i<a.size();i++){
	        if(a.get(i)<min_record ) {
	        	min_record=a.get(i);
	        	//max_record=max_record;
	        	countmin++;
	        }
	        if((int)a.get(i)>max_record) {
	        	max_record=a.get(i);
	        	//min_record=min_record;
	        	countmax++;
	        }
	    }
	    System.out.println(countmax);
	    System.out.println(countmin);
	}

}


