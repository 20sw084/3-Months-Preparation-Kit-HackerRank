package com.tayyaba;
import java.util.Scanner;
public class ArmstrongNo {
    public static void main(String[] args) {
        //       Armstrong no
        Scanner sc = new Scanner(System.in);




        int temp;
        for (int i=100;i<=10000;i++) {
            temp = i;
            int sum = 0;
            if (i <= 1000) {

                while (temp > 0) {
                    int remainder = temp % 10;
                    int cube = remainder * remainder * remainder;
                    sum += cube;
                    temp = temp / 10;
                }
                if (sum == i) {
                    System.out.println(sum);
                }
            } else if (i < 10000) {

                while (temp > 0) {
                    int remainder = temp % 10;
                    int cube = remainder * remainder * remainder * remainder;
                    sum += cube;
                    temp = temp / 10;
                }
                if (sum == i) {
                    System.out.println(sum);
                }

            }


        }
    }
}