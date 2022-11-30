package userdefinedexception;

import java.util.Scanner;
class InvalidUserException1 extends Exception{
	public String getMessage() {
		return "invalid card detail try again";
	}
}

class Atm1{
	int accNum=12345;
	int password=9999;
	int an,pw;
	void acceptInput() throws InvalidUserException1 {
		Scanner scan=new Scanner (System.in);
		System.out.println("enter the account number");
		an=scan.nextInt();
		System.out.println("enter the password");
		pw=scan.nextInt();
		
	}
	void validate() throws InvalidUserException1
	{
		if(an==accNum&&pw==password) {
			System.out.println("take your cash");
		}
		else {
			InvalidUserException1 iue = new InvalidUserException1();
			System.out.println(iue.getMessage());
			throw iue;
		}
	}
}
class bank1{
	void initiate() throws InvalidUserException1 {// as it has inherited the class Excepton that means InvalidUserException1 is a Exception
		                    //so here we can even write throws Exception as it is inherited 
		Atm1 atm=new Atm1();
		atm.acceptInput();
		atm.validate();
		
		
	}
}
public class ATMBANK2 {

	public static void main(String[] args) /*throws InvalidUserException1*/{//so here we can even write throws Exception as it is inherited 
		// TODO Auto-generated method stub
		bank1 bank = new bank1();
		/*bank.initiate();*/// as in this no one is there to handle means no try catch so it goes to defalut exception handler
		try {
			bank.initiate();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
			System.out.println("exception handled");
			
		}
	}

}

// exception that is shown after making it user defiend
/*
 * Exception in thread "main" userdefinedexception.InvalidUserException1: invalid card detail try again
	at userdefinedexception.Atm1.validate(ATMBANK2.java:27)
	at userdefinedexception.bank1.initiate(ATMBANK2.java:37)
	at userdefinedexception.ATMBANK2.main(ATMBANK2.java:46)
*/
