import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static boolean check(final String s, final long n) {
        final String numberString = String.valueOf(n);
        if (s.length() < numberString.length()) {
            return false;
        } else if (s.startsWith(numberString)) {
            final String nextString = s.substring(numberString.length());
            final long nextNumber = n + 1L;
            return nextString.isEmpty() || check(nextString, nextNumber);
        } else {
            return false;
        }
    }
    
    private static long breakString(final String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            final long start = Long.parseLong(s.substring(0, i + 1));
            final String nextString = s.substring(i + 1);
            final long nextNumber = start + 1L;
            if (check(nextString, nextNumber)) {
                return start;
            }
        }   
        return -1L;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            final long start = breakString(s);
            if (start == -1) {
                System.out.println("NO");
            } else {
                System.out.printf("YES %d%n", start);
            }
        }
    }
}
