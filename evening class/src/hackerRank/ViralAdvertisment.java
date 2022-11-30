package hackerRank;

import java.util.Scanner;

public class ViralAdvertisment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		int share=5;
		int like=0,final_count=0;
		
		for (int i = 1; i <= n; i++) {
			like=share/2;
			share=like*3;
			final_count=final_count+like;
		}
		System.out.println(final_count);
		
		

	}

}

