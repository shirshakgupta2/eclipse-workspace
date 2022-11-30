import java.util.HashSet;
import java.util.Scanner;

public class rohinitechsubArray {
	static  boolean isValidSudoku(int a[][]) {
		HashSet hs=new HashSet();//hs will never allow duplicates
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if(!hs.add("row"+i+a[i][j])||!hs.add("col"+j+a[i][j])) {
					/*hs.add("row"+i+a[i][j]) returns true 
					if added and returns false if not added*/
					return false;
				}
				if(!hs.add("box"+((i/3)*3+j/3)+a[i][j])) {
					return false;
					
				}
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    int a[][]=new int[9][9];
	    for(int i=0;i<=a.length-1;i++){
	        for(int j=0;j<=a[i].length-1;j++){
	            a[i][j]=scan.nextInt();
	        }
	    }
	    if (isValidSudoku(a)){
	    System.out.println("Finished!");
	}
	else{
	    System.out.println("Try again!");
	}

	}

}
