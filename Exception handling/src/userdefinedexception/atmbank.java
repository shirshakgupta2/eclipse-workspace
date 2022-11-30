package userdefinedexception;

import java.util.Scanner;
class InvalidUserException extends Exception{
	public String getMessage() {
		return "invalid card detail try again";
	}
}

class Atm{
	int accNum=12345;
	int password=9999;
	int an,pw;
	void acceptInput() {
		Scanner scan=new Scanner (System.in);
		System.out.println("enter the account number");
		an=scan.nextInt();
		System.out.println("enter the password");
		pw=scan.nextInt();
	}
	void validate() throws InvalidUserException
	{
		if(an==accNum&&pw==password) {
			System.out.println("take your cash");
		}
		else {
			InvalidUserException iue = new InvalidUserException();
			System.out.println(iue.getMessage());
			throw iue;
		}
	}
}
class bank{
	void  intiate() {
		Atm atm = new Atm();
		try {
			atm.acceptInput();
			atm.validate();
		}
		catch(InvalidUserException iue){
			try {
				atm.acceptInput();
				atm.validate();
			}
			catch(Exception f){
				try {
					atm.acceptInput();
					atm.validate();
				}
				catch(Exception g){
					System.out.println("card is blocked");
					System.exit(0);
				}
			}
		}
		
	}
}

public class atmbank {

	public static void main(String[] args) {
		bank bank = new bank();
		bank.intiate();

	}

}
