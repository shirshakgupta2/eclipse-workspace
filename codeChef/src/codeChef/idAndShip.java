package codeChef;
//www.codechef.com/problems/FLOW010
import java.util.Scanner;

public class idAndShip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
		while(t>0) {
		 //char c[]=scan.nextInt();
		char a=scan.next().charAt(0);
		;
		if(a=='B'||a=='b') {
			System.out.println("BattleShip");
		}else if(a=='C'||a=='c') {
			System.out.println("Cruiser");
		}else	if(a=='D'||a=='d') {
			System.out.println("Destroyer");
		}else	if(a=='F'||a=='f') {
			System.out.println("Frigat");
		}
		t--;}

	}

}
