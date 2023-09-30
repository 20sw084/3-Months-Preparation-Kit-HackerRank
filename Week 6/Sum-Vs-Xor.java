import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        
        if (n == 0) {
            System.out.println(1);
            return;
        }
        
        int MSB = 0;
        for (int i = 63; i >= 0; i--)
            if ( ((1L << i) & n) != 0) {
                MSB = i + 1;
                break;
            }
        long mask = 1;
        for (int i = 1; i < MSB; i++)
            mask |= mask << 1;
        long NOTn = -n - 1L;
        NOTn &= mask;
        int numBits = Long.bitCount(NOTn);
        
        long count = 1L << numBits;
                
        
        System.out.println(count);
    }
}