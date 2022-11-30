package hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		Scanner scan = new Scanner(System.in);
		int n=3;
		ArrayList a = new ArrayList();
		ArrayList b = new ArrayList();
		ArrayList c = new ArrayList();
		int a_count=0,b_count=0;
		for (int i = 0; i < n; i++) {
			a.add(scan.nextInt());
		}
		for (int i = 0; i < n; i++) {
			b.add(scan.nextInt());
		}
		for (int i = 0; i < n; i++) {
			if((int)a.get(i)<(int)b.get(i)) {
				b_count++;
			}
			if((int)a.get(i)>(int)b.get(i)) {
				a_count++;
			}
		}
		c.add(a_count);
		c.add(b_count);
		System.out.println(c);
		
		

	}

}
