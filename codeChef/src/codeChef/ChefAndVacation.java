package codeChef;

import java.util.Scanner;

//www.codechef.com/problems/CHEFTRANS
public class ChefAndVacation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
		while(t>0)
		{
		int x=scan.nextInt();
		int y=scan.nextInt();
		int z=scan.nextInt();
		if(x+y<z){
		   System.out.println("PLANEBUS");
		}else if(x+y==z){
		   System.out.println("EQUAL");
		}else {
		   System.out.println("TRAIN");
		}
		t--;
		    
		}

	}

}
