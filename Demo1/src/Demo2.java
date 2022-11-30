import java.util.Scanner;
import changeCase.Casechange;

public class Demo2 {

	static String PalindromFlip(String s,int n){
        int one=0,zero=0;
		    for (int i=0;i<s.length() ;i++ ){
		        if(s.charAt(i)=='1'){
		            one++;
		        }
		        else
		        zero++;
		    } 
		    if(n%2==0){
		        if(one%2!=0 &&zero%2==0){
		            return "NO";
		        }
		        else
		        return "YES";
		    }
		    else
		    return "YES";
    }
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		int t =scan.nextInt();
		while(t-->0){
		    int n=scan.nextInt();
		    String s=scan.next();
		    System.out.println(PalindromFlip(s,n));
		    
		}
	}

}
