package hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class ircularArrayRotation {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n =scan.nextInt();
		int k =scan.nextInt();
		int q =scan.nextInt();
		//int[]a=new int[n];
		ArrayList a=new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			a.add(scan.nextInt());
		}
		ArrayList queries=new ArrayList<>(q);
		for (int i = 0; i < n; i++) {
			queries.add(scan.nextInt());
		}
//		for (int i = 0; i < a.length; i++) {
//			a[i]=scan.nextInt();
//		}
//		int[]qu=new int[q];
//		for (int i = 0; i < qu.length; i++) {
//			qu[i]=scan.nextInt();
//		}
		for(int i=0;i<k;i++){
	        a.add(0,a.get(a.size()-1));
	        a.remove(a.size()-1);
			
	    }
	    ArrayList al=new ArrayList<>();
	    for(int i=0;i<queries.size();i++){
	        al.add(a.get((int)queries.get(i)));

	    }
	    System.out.println(al);

	}

}
