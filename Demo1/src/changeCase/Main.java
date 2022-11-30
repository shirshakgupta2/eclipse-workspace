package changeCase;

import java.util.*;
import java.io.*;
import java.math.*;




class Outcome {

    /*
     * Implement method/function with name 'smoothData' below.
     * The function accepts following as parameters.
     *  1. ar is of type List<Integer>.
     *  2. K is of type int.
     * return List<Float>.
     */

    public static List<Float> smoothData(List<Integer> ar,int K){
        //Write your code here
        ArrayList<Float> al=new ArrayList<Float>();
        float sum= 0.00f;
        for(int i=0;i<ar.size()-K;i++){
            for(int j=i;j=(int)(i+K-1);j++){
                sum=sum+(float)(ar.get(j));
            }
            al.add(sum);
            
        }

        return al; //return type "List<Float>".
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getProperty("OUTPUT_FILE_PATH")));
        bufferedWriter.write("\n");
        bufferedWriter.close();
        bufferedWriter = new BufferedWriter(new FileWriter(System.getProperty("OUTPUT_FILE_PATH"),true));
        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = new ArrayList<>();

        String[] artempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(artempItems[i]);
            ar.add(arItem);
        }

        int K = Integer.parseInt(bufferedReader.readLine().trim());

        List<Float> outcome = Outcome.smoothData(ar,K);

        for(int i=0;i<outcome.size();i++) {
            bufferedWriter.write(outcome.get(i).toString());
            if(i<outcome.size()-1)
                bufferedWriter.write(" ");
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
