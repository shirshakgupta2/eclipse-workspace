package hackerRank;

import java.util.Scanner;

public class DrawingBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int p=scan.nextInt();
		int left=0,right=0;
		 if(n%2==0) {
            if(p%2==0){
                left= (n-p)/2;
            }
            else{
                 left=(n-p-1)/2;
            }
	      }
		 else {
            if(p%2!=0){
                left= (n-p)/2;
            }
            else{
                 left=(n-p-1)/2;
            }
		 }
	        
        if(n%2==0) {
	        if(p%2==0){
	        	right= p/2;
	        }
		
		    else{
		        right= (p-1)/2;
		    }
        }
        else {
        	if(p%2!=0){
        		right= p/2;
	        }
	        else{
	            right= (p-1)/2;
	        }
        }
	   
        System.out.println(left);
        if(right<left)
            System.out.println(right); 
        else
        	System.out.println(left);

	}

}
