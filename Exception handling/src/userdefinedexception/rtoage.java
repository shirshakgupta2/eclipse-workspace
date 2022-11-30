package userdefinedexception;

import java.util.Scanner;

class UnderAgeException extends Exception{
	public String getMessage() {
		return "you are too young have patience";
	}
}
class OverAgeException extends Exception{
	public String getMessage() {
		return "you are too old take rest";
	}
}
class license{
	int age;
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your age");
		age=scan.nextInt();
		}
	void validate() throws Exception {// we can also write  throws UnderAgeException,OverAgeException
		if(age<=65&&age>=18) {
			System.out.println("you are eligible for the license");
		}
		
	
		else if(age<18)
		{
			UnderAgeException uae=new UnderAgeException();
			System.out.println(uae.getMessage());;
			throw uae;
		}
		else {
			OverAgeException oae=new OverAgeException();
			System.out.println(oae.getMessage());;
			throw oae;
		}
	}
}
class Rto{
	void permit(){
		license l=new license();
		
		try {
			l.acceptInput();
		
			l.validate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			try {
				l.acceptInput();
				l.validate();
			} catch (Exception f) {
				// TODO Auto-generated catch block
				System.out.println("better luck next time");
				System.exit(0);
			}
		}
	}
}


public class rtoage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rto rto=new Rto();
		rto.permit();

	}

}
