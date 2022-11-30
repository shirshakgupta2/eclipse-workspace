package codeChef;
//www.codechef.com/problems/BMI
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scan= new Scanner(System.in);
				int t=scan.nextInt();
				while(t>0) {
				int M=scan.nextInt();
				int H=scan.nextInt();
				int bmi=M/(H*H);
				if(bmi<=18) {
					System.out.println(1);
				}else if(bmi>=19&&bmi<=24) {
					System.out.println(2);
				}else if(bmi>=25&&bmi<=29) {
					System.out.println(3);
				}else if(bmi>=30) {
					System.out.println(4);
				}
				t--;}

			}
		


	}


