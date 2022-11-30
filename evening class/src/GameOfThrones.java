import java.util.Arrays;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/game-of-thrones/problem
	
public class GameOfThrones {
	static String gameOfThrones(String s) {
		char []a=s.toCharArray();
        Arrays.sort(a);//there is a build in class called as arrays where there is static method called as sort
                       //so that we dont have to call an object to access to the method
        int count=0;
        int i=0;
        while( i<a.length) {
        
        if(i<(a.length)-1&&a[i]==a[i+1]) {
        	i=i+2;
        }else {count++;
        	i++;
        }
       
        }
       
        if(count<=1) {
        	return "yes";
        }else {
        	return"no";
        }
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		System.out.println(gameOfThrones(s));
		
      		
	}
}
