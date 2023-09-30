
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int N, M;
        while (T-- > 0) {
            N = in.nextInt();
            M = in.nextInt();
            System.out.println((M != 1 && N%2 == 1)? 1 : 2 );

        }
    }
}
