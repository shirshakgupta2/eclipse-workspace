package oops;

import java.util.Scanner;

class User{
	private int id;
	private String userName;
	private String password;
	public User(int id, String userName, String password) {
		//super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	public User() {
		//super();
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
}
class userBO{
	User[] getUsers() {//
		User[] users=new User[5];// we want to store user not int or anything
		   // user here is a constructor created which takes (id,userName,password)
		users[0]=new User(1, "Louis","rxfsuzA2345");
		users[1]=new User(2, "Messie","hpphmf1:");
		users[2]=new User(3,"Steve","opefKt");
		users[3]=new User(4,"Kallis ","23456778" );
		users[4]=new User(5,"Wipro","A$%");
		return users;
	}

	private static String encryptPassword(String password) {
		String pwd="";
		for(int i=0;i<password.length();i++) {
			pwd+=(char)((password.charAt(i))+1);
		}return pwd;
	}
	boolean validate(String userName,String password) {
		  String pwd=encryptPassword(password);
		  User[] users=getUsers();
		  for (int i = 0; i < users.length; i++) {
			String pass =users[i].getPassword();
			String un=users[i].getUserName();
			if(un.equals(userName)&&pass.equals(pwd)) {
				return true;
			}
		}
		  return false;
	}
}
public class usercredentials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(userBO.encryptPassword(""));
		Scanner scan = new Scanner(System.in);
		System.out.println("UserName:");
		String un = scan.nextLine();
		System.out.println("Password:");
		String pw = scan.nextLine();
		
		userBO ub = new userBO();
		System.out.println(ub.validate(un, pw));


	}

}
