package codeChef;
//www.codechef.com/problems/CHSFORMT
import java.util.Scanner;

//www.codechef.com/problems/CHSFORMT
public class chessformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
		while(t>0) {
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a+b<3) {
			System.out.println(1);
		}else if(a+b>=3&&a+b<=10) {
			System.out.println(2);
		}else if(a+b>=11&&a+b<=60) {
			System.out.println(3);
		}else if(a+b>60) {
			System.out.println(4);
		}
		t--;}

	}

}
