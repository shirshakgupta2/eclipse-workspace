package hackerRank;

import java.util.Scanner;

public class CatAndMouse {
	static String catAndMouse(int x,int y,int z) {
		int d1=0,d2=0;
		if(z>=x) {
			d1=z-x;
		}
		else
			d1=x-z;
		if(y>=z) {
			d2=y-z;
		}
		else
			d2=z-y;
		if(d1==d2)
			return "Mouse C";
		else if(d1>d2)
			return "Cat B";
		else
			return "Cat A";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		int z=scan.nextInt();
		catAndMouse(x,y,z);
		

	}

}
