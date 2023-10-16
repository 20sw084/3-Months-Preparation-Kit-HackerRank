/*
Write a java program which takes integer and print currency notes and coins
For example 6789 can be represented as:
5000 -> 1
1000 -> 1
500 --> 1
100 --> 2
50 ---> 1
20 ---> 1
10 ---> 1
5 ----> 1
2 ----> 2
1 ----> 0
*/
package com.java;
import java.util.Scanner;
class Currency
{
public static void main(String[] args)
{
int a,b,c;
Scanner Scan = new Scanner(System.in);
System.out.println("Enter integer value");
a = Scan.nextInt();
b = a/5000;
c = a%5000;
System.out.println(5000+"	"+b);
a = c/1000;
b = c%1000;
System.out.println(1000+"	"+a);
c = b/500;
a = b%500;
System.out.println(500+"	"+c);
b = a/100;
c = a%100;
System.out.println(100+"	"+b);
a = c/50;
b = c%50;
System.out.println(50+"	"+a);
c = b/20;
a = b%20;
System.out.println(20+"	"+c);
b = a/10;
c = a%10;
System.out.println(10+"	"+b);
a = c/5;
b = c%5;
System.out.println(5+"	"+a);
c = b/2;
a = b%2;
System.out.println(2+"	"+c);
System.out.println(1+"	"+a); 
}
}