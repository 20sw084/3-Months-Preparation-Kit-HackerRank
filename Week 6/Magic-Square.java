import java.io.*;
import java.util.*;
public class Solution {
    public static int diff(int[][] s1,int[][] s2){
        int d=0;
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                d+=Math.abs(s1[i][j]-s2[i][j]);
        return d;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s[][]=new int[3][3];
        for(int i=0;i<3;i++)
           for(int j=0;j<3;j++)
           {s[i][j]=sc.nextInt();}
        int a[][]={{2,7,6},{9,5,1},{4,3,8}};
        int b[][]={{2,9,4},{7,5,3},{6,1,8}};
        int c[][]={{4,3,8},{9,5,1},{2,7,6}};
        int d[][]={{4,9,2},{3,5,7},{8,1,6}};
        int e[][]={{6,1,8},{7,5,3},{2,9,4}};
        int f[][]={{6,7,2},{1,5,9},{8,3,4}};
        int g[][]={{8,1,6},{3,5,7},{4,9,2}};
        int h[][]={{8,3,4},{1,5,9},{6,7,2}};
        ArrayList<int[][]> val=new ArrayList<>();
        int res=Integer.MAX_VALUE;
        val.add(a);val.add(b);val.add(c);val.add(d);val.add(e);val.add(f);val.add(g);val.add(h);
        for(int[][] x:val){
            res=Math.min(res, diff(x, s));
        }
        System.out.println(res);
    }
}
