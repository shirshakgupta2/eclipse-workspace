package array;
import java.util.Scanner;
public class Array {
public static void main(String [] args)
{/*int []a,i;*/    		 //this is the wrong way to write an array we only right 
	                     //int []a  but not int []a,i; 
	int a[],i;
	 a=new int [5];
Scanner scan =new Scanner(System.in);
for( i=0;i<=4;i++)
{
	//System.out.println("enter the age of "+(5-i)+"th"+" girl");
	// a[i]=scan.nextInt();
}
for( i=0;i<=4;i++) {
	System.out.println("ages are");
	System.out.println(a[i]);
}
}
}
