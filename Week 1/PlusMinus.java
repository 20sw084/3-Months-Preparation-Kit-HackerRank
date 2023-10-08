import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class PlusMinus {

    class Result {
        
        public static void plusMinus(List<Integer> arr) {

            int positive = 0;
            int negative = 0;
            int zeros = 0;

            for(int i = 0; i < arr.size(); i++) {
                if(arr.get(i) > 0) {
                    positive++;
                }
                else if(arr.get(i) < 0) {
                    negative++;
                } else if(arr.get(i) == 0) {
                    zeros++;
                }
            }

            double result1 = (double)positive/arr.size();
            double result2 = (double)negative/arr.size();
            double result3 = (double)zeros/arr.size();

            System.out.println(String.format("%.6f", result1));
            System.out.println(String.format("%.6f", result2));
            System.out.println(String.format("%.6f", result3));
        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrTemp[i]);
                arr.add(arrItem);
            }

            Result.plusMinus(arr);

            bufferedReader.close();
        }
    }

}
