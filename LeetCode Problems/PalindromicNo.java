package com.tayyaba;
import java.util.Scanner;
public class PalindromicNo {
    public static void main(String[] args) {
        //       palindrome
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sequence of number:");
        int number=sc.nextInt();
        int temp=number;
        int reverseorder=0;
        while (temp>0){
            int remainder= temp%10;
            reverseorder=reverseorder*10+remainder;
            temp=temp/10;
        }
        if (number==reverseorder){
            System.out.println("The number is palindromic number.");
        }
        else {
            System.out.println("The entered number is not palindromic number.");
        }









    }
}
