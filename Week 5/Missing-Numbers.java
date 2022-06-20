import java.io.*;
import java.util.*;
class Result {
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
    Collections.sort(arr);
        Collections.sort(brr);
        List<Integer> crr = new ArrayList<>();
        int j=0;
    for(int i=0;i<brr.size();i++){
        int brrValue=brr.get(i);
        if(j<arr.size() && brr.get(i).equals(arr.get(j))) {j++;}
        else if(crr.size()==00||crr.get(crr.size()-1)!=brrValue)        {
            crr.add(brrValue);
            if(j<arr.size() && brrValue>arr.get(j)){
                j++;
            }
        }
    }
        return crr;   
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

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrTemp[i]);
            brr.add(brrItem);
        }

        List<Integer> result = Result.missingNumbers(arr, brr);

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
