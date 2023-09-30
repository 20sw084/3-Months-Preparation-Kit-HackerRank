import java.io.*;
import java.util.*;

public class Solution {

    private static int[][] tickFill(int[][] in) {
        int[][] out = new int[in.length][];
        for (int i = 0; i < in.length; i++) {
            out[i] = new int[in[i].length];
            for (int j = 0; j < in[i].length; j++) {
                if (in[i][j] == 1) {
                    throw new RuntimeException("Bomb on a fill");
                } else {
                    out[i][j] = in[i][j] == 0 ? 3 : (in[i][j] - 1);
                }
            }
        }
        return out;
    }
    
    private static int[][] tick(int[][] in) {
        int[][] out = new int[in.length][];
        for (int i = 0; i < in.length; i++) {
            out[i] = in[i].clone();
            for (int j = 0; j < in[i].length; j++) {
                if (out[i][j] > 0) {
                    out[i][j]--;
                }
            }
        }
        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                if (in[i][j]==1) {
                    if (i > 0) {
                        out[i-1][j] = 0;
                    }
                    if (i < in.length-1) {
                        out[i+1][j] = 0;
                    }
                    if (j > 0) {
                        out[i][j-1] = 0;
                    }
                    if (j < in[i].length-1) {
                        out[i][j+1] = 0;
                    }
                }
            }            
        }
        return out;
    }
    
    public static void p(int[][] bs) {
        for (int i = 0; i < bs.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < bs[i].length; j++) {
                sb.append(bs[i][j]>0?'O':'.');
            }
            System.out.println(sb);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        
        int[][] bs = new int[r][];
        for (int i = 0; i < r; i++) {
            String s = sc.nextLine();
            bs[i] = new int[c];
            for (int j = 0; j < c; j++) {
                bs[i][j] = s.charAt(j)=='O'?3:0;
            }
        }
        
        if (n >= 200) {
            n = ((n-1) % 4)+5;
        }
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                bs = tick(bs);
            } else {
                bs = tickFill(bs);
            }
            //System.out.println("- "+i);
            //p(bs);
        }
        p(bs);
        
    }
}