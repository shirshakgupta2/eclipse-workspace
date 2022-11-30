package hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class AppleAndOrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int s=scan.nextInt();
		int t=scan.nextInt();
		int a=scan.nextInt();
		int b=scan.nextInt();
		int m=scan.nextInt();
		int n=scan.nextInt();
		ArrayList<Integer> apples = new ArrayList<Integer>(m);
		for (int i = 0; i < m; i++) {
			apples.add(scan.nextInt());
		} 
		ArrayList<Integer> oranges = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			oranges.add(scan.nextInt());
		}
		int apple_count=0,orange_count=0;
	    for(int i=0;i<apples.size();i++){
	    	if((int)apples.get(i)+a>=s&&(int)apples.get(i)+a<=t){
	            apple_count++;
	        }
	    }
	    for(int i=0;i<oranges.size();i++){
	    	if((int)oranges.get(i)+b<=t&&(int)oranges.get(i)+b>=s){
	            orange_count++;
	        }
	    }
	    System.out.println(apple_count);
	    System.out.println(orange_count);


	   


	}

}
