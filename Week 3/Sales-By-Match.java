import java.io.*;      
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static int sockMerchant(int n, List<Integer> ar) {
        int pair=0;
        for(int i=0;i<ar.size();i++){
            for(int j=i+1;j<ar.size();j++){
                if(ar.get(i)==0 && ar.get(j)==0){
                    i++;
                    j++;
                }
                else if(ar.get(i)==0){
                    i++;
                }
                else if(ar.get(j)==0){
                    j++;
                }
                else if(ar.get(i)==ar.get(j)){
                    pair++;
                    ar.set(i,0);
                    ar.set(j,0);
                    break;
                }
                // else{
                //     j=0;
                // }
            }
        }
        return pair;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
