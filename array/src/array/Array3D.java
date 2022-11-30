package array;

import java.util.Scanner;

public class Array3D {
	public static void main(String [] args)
	{
		int a[][]=new int [2][5];
	Scanner scan =new Scanner(System.in);
	for(int i=0;i<=a.length-1;i++)
	{for(int j=0;j<=a[i].length-1;j++)
		{System.out.println("enter the ages of student"+i+"class girls is"+j);
		 a[i][j]=scan.nextInt();
		}
	}System.out.println("ages are");
	for(int i=0;i<=a.length-1;i++)
	{for(int j=0;j<=a[i].length-1;j++)
		{System.out.println(a[i][j]);
		}
		}
}
}
