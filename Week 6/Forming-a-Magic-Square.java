import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] square = new int[9];
        for (int i = 0; i < 9; i++) {
            square[i] = scan.nextInt();
        }
        int[][] matrix={{4,9,2,3,5,7,8,1,6},
                        {2,7,6,9,5,1,4,3,8},
                        {6,1,8,7,5,3,2,9,4},
                        {8,3,4,1,5,9,6,7,2},
                        {2,9,4,7,5,3,6,1,8},
                        {6,7,2,1,5,9,8,3,4},
                        {8,1,6,3,5,7,4,9,2},
                        {4,3,8,9,5,1,2,7,6}};
        
        int minOff = 99;
        for (int i = 0; i < 8; i++) {
            int off = 0;
            for (int j = 0; j < 9; j++) {
                if (square[j] != matrix[i][j]) {
                    off += Math.abs(square[j] - matrix[i][j]);
                }
            }
            if (off < minOff) minOff = off;
        }
        System.out.println(minOff);
    }
}