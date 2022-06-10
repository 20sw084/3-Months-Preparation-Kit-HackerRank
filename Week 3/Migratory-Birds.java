import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static int migratoryBirds(List<Integer> arr) {
        Collections.sort(arr);
     int low=0;
     int[] ar=new int[5];
    for(int i=0;i<ar.length;i++){ 
        ar[i]=0;
    }
        for(int i=0;i<arr.size();i++){ 
            int num=arr.get(i);        
            ar[num-1]++;
        }
        int lar=0;
        int inx=0;
        for(int i=0;i<ar.length;i++){ 
            if(lar<ar[i]){
                lar=ar[i];
                inx=i;
            }      
        }
        return inx+1;
    // Arrays.sort(ar);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
