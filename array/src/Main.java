import java.util.Scanner;

public class Main {
	
	
	static void ArrayChallenge(int[] arr) {
	    // code goes here  
	    int a[]= new int[arr.length];
	    int mul=1;
	    for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(j==i) {
					continue;
				}
				else {
					mul=mul*arr[j];
				}
			}
			a[i]=mul;
			mul=1;
		}
	    
	    for (int i = 0; i < a.length; i++) {
			if(i<a.length-1) {
				System.out.print(a[i]+"-");
			}
			else
				System.out.println(a[i]);
		}
	    


	    //return a;
	    
	  }
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int n=scan.nextInt();
	    int[]arr=new int[n];
	    for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}
	    ArrayChallenge(arr);
//	    System.out.print(ArrayChallenge(arr)); 
	    

	}

}
