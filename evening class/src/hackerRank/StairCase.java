package hackerRank;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		for (int i = 0; i < n; i++){
            for (int j = 1; j <=n; j++){
                if(j<n-i){
                    
                	System.out.print(" ");
                }
                else
                	System.out.print("#");
            }
            System.out.println();
            
        }

	}

}
