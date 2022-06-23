import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static int pickingNumbers(List<Integer> a) {
    int res = 1;
        List<Integer> nums = new ArrayList<>();
        Collections.sort(a);
        for (int i = 0; i < a.size() - 1; i++) {
            nums.add(a.get(i));
            for (int j = i + 1; j < a.size(); j++) {
                if (Objects.equals(a.get(i), a.get(j)) || a.get(j) == a.get(i) + 1) {
                    nums.add(a.get(j));
                    if (nums.size() > res) res = nums.size();
                } else {
                    nums.clear();
                    break;
                 }
            }
            nums.clear();
        }
    return res;
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}