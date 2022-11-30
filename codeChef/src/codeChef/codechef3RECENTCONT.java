//Recent contest problems
package codeChef;

import java.util.Scanner;

public class codechef3RECENTCONT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		int t=scan.nextInt();
		while(t-->0){
		    int n=scan.nextInt();
		int countS=0,countL=0;
		String a[]=new String[n];
		for(int i=0;i<a.length;i++){
		    a[i]=scan.next();
		}
		for(int i=0;i<a.length;i++){
		    System.out.print(a[i]+" ");
		}
		
		for(int i=0;i<a.length;i++){
		    if(a[i].equals("START38")){
		        countS++;
		    }
		    
		    else{
		        countL++;
		    }
		}
		System.out.println(countS+" "+countL);
		}

	}

}
