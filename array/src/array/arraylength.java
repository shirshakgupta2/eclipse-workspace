   package array;
   import java.util.Scanner;
public class arraylength {

public static void main(String [] args)
{
	int a[]=new int [5];
Scanner scan =new Scanner(System.in);
for(int i=0;i<=a.length-1;i++)
{
	System.out.println("enter the ages of "+i+" girls are");
	 a[i]=scan.nextInt();
}
for(int i=0;i<=a.length-1;i++) {
	System.out.println("ages are");
	System.out.println(a[i]);
}
	}
}



