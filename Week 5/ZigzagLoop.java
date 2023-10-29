
package com.java;

import java.util.Scanner;

public class ZigzagLoop {

    public static void main(String[] args) {
        System.out.println("Enter any value: " );
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();
        for(int j=1;j<=i;j++){
            int result=j;
            System.out.print(j+" ");
            for(int k=1;k<i;k++){
                result+=i;
                System.out.print(result+" ");
            }
            System.out.println();
        }
    }
}