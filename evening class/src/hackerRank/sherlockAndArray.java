package hackerRank;
import java.util.Scanner;

public class sherlockAndArray {

	public static String leftsumRightsum(int[] ar) {
		int totalsum = 0;
		for (int i = 0; i < ar.length; i++) {
			totalsum = totalsum + ar[i];
		}
		
		int leftsum = 0, rightsum = 0;
		
		for (int i = 0; i < ar.length; i++) {
			rightsum = totalsum - ar[i] - leftsum;
			if(leftsum == rightsum) {
				return "YES";
			}
			leftsum = leftsum + ar[i];
		}
		return "NO"; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int ar[]=new int [n];
        
        int total_sum=0;
       
        leftsumRightsum(ar);
       
      
        for(int i=0;i<ar.length;i++) {
        	 ar[i]=scan.nextInt();
        }
        for(int i=0;i<ar.length;i++) {
        	 total_sum=total_sum+ar[i];
        }
        int left_sum=0;
        for(int i=0;i<ar.length;i++) {
        	int right_sum=total_sum-ar[i]-left_sum;
        	if(right_sum==left_sum) {
        		System.out.println("yes");
        		break;
        		
        	}
        	left_sum=left_sum+ar[i];
        }
        
       

	}

}
