import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static List<Integer> closestNumbers(List<Integer> arr) {
        Collections.sort(arr);
        int min=10000000;
    List<Integer> lis=new ArrayList<Integer>();
        for(int j=1;j<arr.size();j++){
            if(arr.get(j)-arr.get(j-1)<min){
                min=arr.get(j)-arr.get(j-1);
            }
        }
        for(int j=1;j<arr.size();j++){
            if(arr.get(j)-arr.get(j-1)==min){
                lis.add(arr.get(j-1));
                lis.add(arr.get(j));
            }
        }
    return lis;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        List<Integer> result = Result.closestNumbers(arr);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
