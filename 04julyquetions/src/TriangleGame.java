import java.util.Scanner;
public class TriangleGame {
	void game(int a,int b,int c) //put static before void to call the method without creating an object such as d here//
	{
      int sum=a+b+c;
      if(sum==180) {
     if(a==b&&b==c&&c==a){
    	  System.out.println("wins the 3 rd prize");
      }
      else if(a==90||b==90||c==90)
      {
    	  System.out.println("wins the 2nd prize");
      }
      else {
    	  System.out.println("wins the 1st prize");
      }
     }
     else {
    	  System.out.println("does not win any prize");
      }

}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter three no. between 1 to 180 to which can from a triangle ");
		int num1=scan.nextInt();//we can take a in place of num1//
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		/*if(num1>=181||num2>=181||num3>=181) {
			System.out.println("Please enter the value within the range");
		}else {
			break;
		}*/
		TriangleGame d= new TriangleGame();// without mking an object of class TriangleGame we can call the method //
		d.game(num1,num2,num3);//d.game(a,b,c)
	
	}
}

