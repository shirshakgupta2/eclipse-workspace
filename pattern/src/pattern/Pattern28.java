package pattern;

public class Pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i==0||j==0||i==n-1||j==n-1||
						j==n/2||i==n/2||i==j||i+j==n-1||
						i+j==n/2||i-j==n/2||i+j==(n-1)+(n/2)||j-i==n/2) {
					System.out.print("* ");
					
				}
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}

	}

	
}


// every line will have condition
/*____________________________________________
|i==0,j==0,i==n-1,j==n-1,                     |
|j==n/2,i==n/2,i==j,i+j==n-1				  |
|i+j==n/2,i-j==n/2,**i+j==(n-1)+(n/2),j-i==n/2|
|_____________________________________________|
*/
/*
* * * * * * * * * * * 
* *     * * *     * * 
*   * *   *   * *   * 
*   * *   *   * *   * 
* *     * * *     * * 
* * * * * * * * * * * 
* *     * * *     * * 
*   * *   *   * *   * 
*   * *   *   * *   * 
* *     * * *     * * 
* * * * * * * * * * *
*/