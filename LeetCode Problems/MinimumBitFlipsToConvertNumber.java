package SuccessfullySubmittedProblems;

public class MinimumBitFlipsToConvertNumber {
    /*
    Runtime
0 ms
Beats
100%
Memory
41.6 MB
Beats
9.2%
     */
         public int minBitFlips(int start, int goal) {
         return countSetBits(start ^ goal);
     }
     public static int countSetBits(int n ){
         int count = 0;
         while(n != 0){
             count++;
             n &= n-1;
         }
         return count;
     }
//    public int minBitFlips(int start, int goal) {
//        return Integer.bitCount(start ^ goal);
//    }
}
