import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    public static void miniMaxSum(List<Integer> arr) {
        long sum = 0;
        long min = 1000000000;
        long max = 0;
        for(int i=0;i<arr.size();i++){
            long n = arr.get(i);
            sum = sum + n;
            if (min > n) {
                min = n;
            }
            if (max < n) {
                max = n;
            }
        }
        
        System.out.println((sum - max) + " " + (sum - min));
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
