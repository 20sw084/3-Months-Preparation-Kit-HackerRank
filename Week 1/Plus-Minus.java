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

class Result {
    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        double pos=0,neg=0,zer=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>0) pos++;
            if(arr.get(i)<0) neg++;
            if(arr.get(i)==0) zer++;
        }
        pos=pos/arr.size();
        neg=neg/arr.size();
        zer=zer/arr.size();
        System.out.println(String.format("%.6f", pos));
        System.out.println(String.format("%.6f", neg));
        System.out.println(String.format("%.6f", zer));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
