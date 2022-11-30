

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0){
		    int n=scan.nextInt();
		    ArrayList<Integer> a=new ArrayList<Integer>(n);
		    for (int i=0;i<n ;i++ ){
                 a.add(scan.nextInt());
            }
            int count=0;
            for (int i=0;i<n-1 ;i++ ){
                if(a.get(i)==a.get(i+1)){
                    // if(a.get(i)==1){
                    //     a.add(i+1,0);
                    // }
                    // else
                    //     a.add(i+1,1);
                    count++;
                }
            }
            System.out.println(count);
		  //  int n=scan.nextInt();
    //         int a[]=new int[n];
    //         for (int i=0;i<a.length ;i++ ){
    //             int a[i]=scan.next();
    //         }
    //         for (int i=0;i<a.length ;i++ ){
    //             if(a[i]==a[i+1]){
                    
    //             }
    //         }
            
		}
        
	//	ArrayList<String> al=new ArrayList<String>(s);
	    
		
	}
}
