package array;
import java.util.Scanner;
public class Arraydatatypya 
{
	public static void main(String [] args)
	{
		double a[]=new double [5];
	Scanner scan =new Scanner(System.in);
	a[0]=10;//array can only store homogeneous values//
	a[1]=11;
	a[2]=99.9;
	a[3]=45;
	a[4]=14;
	a[5]=20;//array  can not grow or shrink in size//
	for(int i=0;i<=4;i++)
	{
		System.out.println("enter the ages of "+i+" girls are");
		 /*a[i]=scan.nextInt();*/
		System.out.print(a[i]+" ");
	}
	/*for(int i=0;i<=4;i++) 
	{
		System.out.println("ages are");*/
	/*System.out.println(a[i]);
	}*/
	}
}


