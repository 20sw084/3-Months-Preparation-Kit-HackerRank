package com.Functions;
import java.util.Scanner;
public class pythagorian {
    public static String pythagoreanTriplet(int ...var){
        int p=var[0]*var[0];
        int b=var[1]*var[1];
        int h=var[2]*var[2];
        int sumpb=p+b;
        if (h==sumpb){
            return "yes";
        }
        else {
            return "No";
        }
    }
    public static void main(String[] args) {
        // pythagorean triplet
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println("Is the given triplet is pythagorean triplet or not?"+pythagoreanTriplet(num1,num2,num3));
    }
}
