 package codeChef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class steelGrade
{
	public static void main (String[] args)
	{
	    Scanner scan=new Scanner(System.in);
	    int x=scan.nextInt();
	    
       while(x>0){
           int h=scan.nextInt();
       double c=scan.nextDouble();
        int t=scan.nextInt();
        System.out.println();
        if(h>50 && c<0.7 && t>5600){
            System.out.println("10");
        }
        else if(h>50 && c<0.7){
           System.out.println("9");
        }
        else if(c<0.7 && t > 5600){
            System.out.println("8");
        }else if(h>50 && t>5600){
           System.out. println("7");
        }else if(h>50 || c<0.7 || t>5600){
            System.out. println("6");
        }else {
             System.out. println("5");
        }x--;
       }
	}
}


