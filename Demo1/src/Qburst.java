import java.util.Scanner;
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

//coding_area_start



class Result {

	/*
	* Complete the 'letterCombinations' function below.
	*
	* The function is expected to return a STRING_ARRAY.
	* The function accepts following parameters:
		* 1. INTEGER number 
	 
	*/

	public static List<String> letterCombinations(int number) 
	{
		String number1 = String.valueOf(number);
		//Type your code below
        List<String> combinations = new ArrayList<>();
        if(number1==null||number1.isEmpty()){
            return combinations;
        }
        String []lettersAndNum= new String[]{
           "shirshak","gupta", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        findCombinations(combinations,number1,new StringBuilder(),0,lettersAndNum);
        return combinations;


        

	}
    static void findCombinations(List<String> combinations,String number1,StringBuilder previous,int index,String []lettersAndNum){
        if(index==number1.length()){
            combinations.add(previous.toString());
            return;
        }
        String letters=lettersAndNum[number1.charAt(index)-'0'];
        for(char c: letters.toCharArray()){
            findCombinations(combinations,number1,
            		previous.append(c),index+1,lettersAndNum);
            previous.deleteCharAt(previous.length()-1);
        }
    }
}

//coding_area_end

public class Qburst {
    public static void main(String[] args) throws IOException {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> result = Result.letterCombinations(number);
        for (int i = 0; i < result.size(); i++) 
        {
            System.out.println(result.get(i));
        }
    bufferedReader.close();
    }
}
//public class Qburst {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int number=scan.nextInt();
//		
//	}
//
//}
