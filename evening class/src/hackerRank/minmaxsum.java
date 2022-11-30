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

class Result4 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        Object a[]=arr.toArray();
        Arrays.sort(a);
        long max=0,min=0;
        for(int i=0,j=1;i<a.length-1&&j<a.length;i++,j++){
            max=max+(int)a[j];
            min=min+(int)a[i];
        }
        System.out.println(min+" "+max);


    }

}

public class minmaxsum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result4.miniMaxSum(arr);

        bufferedReader.close();

	}

}
