import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numTests = in.nextInt();
        for (int i = 0; i < numTests; ++i) {
            findWinner(in);
        }
    }
    
    private static void findWinner(Scanner in) {
        String counterAsString = in.next();
        BigInteger counter = new BigInteger(counterAsString);
        int bits = counter.bitLength();
        int moves = -1;
        for (int i = 0; i < bits; ++i) {
            if (!counter.testBit(i)) {
                ++moves;
            } else {
                moves += counter.bitCount();
                break;
            }
        }
        if (moves % 2 == 0) {
            System.out.println("Richard");
        } else {
            System.out.println("Louise");
        }
    }
}