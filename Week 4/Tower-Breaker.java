import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static int numPrimeFactors(int n) {
        int answer = 0;
        for (int i=2; i<=n; i++) {
            if (n%i == 0) {
                answer++;
                n /= i;
                i = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t=0; t<T; t++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (m == 1) {
                System.out.println(2);
                continue;
            }
            if (n%2 == 0) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
            
        }
        
    }
}
    