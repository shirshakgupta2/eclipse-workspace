package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static void sockMerchant( List<Integer> ar) {
    // Write your code here
       Object a[]=ar.toArray();
       
       int temp_count=1;
       int pair=0;
       Arrays.sort(a);
       int i=0;
       while(i<a.length-1) {
//       for (int i = 0; i < a.length-1; i++) {
    	   if(a[i]==a[i+1]) {
    		   temp_count++;
    	   }
    	   else{
    		   pair=pair+temp_count/2;
    		   //System.out.println(pair); 
    		   
    		   temp_count=1;
    		  
    	   }
    	   i++;
       }
       pair=pair+temp_count/2;
       
       System.out.println(pair); 

    }

}

public class Solution1 {
    public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
    	ArrayList<Integer> ar=new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(scan.nextInt());
		}
		Result1 result=new Result1();
		result.sockMerchant(ar);
    }
}

