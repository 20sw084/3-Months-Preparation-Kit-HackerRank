package com.java;
import java.util.Scanner;

/*

A number or string is said to be palindrome if it is exactly same when reversed
Write a java program to ask user to provide string then check
whether provided string is palindrome or not

 */
public class Palindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int count=0;
        for(int i=A.length()-1;i>=0;i--){
            if(A.charAt(count)!=A.charAt(i)){
                System.out.print("No");
                return;
            }
            count++;

        }
        System.out.print("Yes");
    }
}



