package hackerRank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Diagonaldiffrence {
	

	public static int diagonalDiffrence(int a[][]){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i][i];
        }
        //System.out.println(sum);
        int sum1=0;
        
        for (int i = 0,j = a[i].length-1; j>=0&& i < a.length  ;i++, j--) {
            sum1=sum1+a[i][j];
        }
        return Math.abs(sum-sum1);
    }

    public static int  main(String[] args) {
        // TODO Auto-generated method stub
        
        
        
        
        Scanner scan= new Scanner(System.in);
        int n =scan.nextInt();
        
        int a[][]=new int [n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=scan.nextInt();
            }
        }
        
        System.out.println(diagonalDiffrence(a));
		

	}

}
