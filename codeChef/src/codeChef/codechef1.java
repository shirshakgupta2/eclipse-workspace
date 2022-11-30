////Practice makes us perfect
package codeChef;

import java.util.ArrayList;
import java.util.Scanner;

class NoofWeeks{
    int result(){
        Scanner scan=new Scanner(System.in);
        int a[]=new int[4];
        for (int i=0;i<a.length ;i++){
        	a[i]=scan.nextInt();
        } 
        int count=0;
        for (int i=0;i<a.length ;i++){
            if(a[i]>=10){
                
                count++;
            }
        }
        return count;
        
        
    }
}
public class codechef1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0){
		    int n=scan.nextInt();
		    String s=scan.next();
		    ArrayList a=new ArrayList();
		    for (int i=0;i<s.length() ;i++){
		    	String s1="";
		    	s1=s1+s.charAt(i);
                 a.add(Integer.parseInt(s1));
            }
		   // System.out.println(a);
            int count=0;
            for (int i=0;i<a.size()-1 ;i++ ){
                if(a.get(i)==a.get(i+1)){
                   
                    count++;
                }
            }
            System.out.println(count);
		}
//		NoofWeeks now=new NoofWeeks();
//		System.out.println(now.result());

	}

}



