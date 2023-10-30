/*
The Fast Freight Shipping company charges the following rates:
Rate/500 miles shipped         Weight
Rs. 110                       2kg or less
Rs. 220                       Over 2kg but not more than 6 kg
Rs. 370                       Over 6kg but not more than 10 kg
Rs. 480                       Over 10kg but not more than 20 kg

Write a program that asks for the weight of the package and the
distance it is to be shipped, and then display the charges,

Input Validation: Do not accept values of 0 or less for the weight
of the package. Do not accept weights of more than 20Kg (This is the
maximum weight the company will ship). Do not accept distances of
less than 10 miles or more than 3000 miles. These are the company's
minimum and maximum shipping distances.

 */


package com.java;

import java.util.Scanner;

public class ShippingCharges {
    public ShippingCharges(double weight,double distance){
        if(weight<=0||weight>20||distance<10||distance>3000){
            System.out.println("Invalid argument");
            return;
        }
        double amount;
        if(weight<=2){
            if(distance<500)amount=110;
            else if(distance%500==0)amount=110*(int)(distance/500);
            else amount=110*(int)(distance/500)+110;
        }
        else if(weight>2&&weight<=6){
            if(distance<500)amount=220;
            else if(distance%500==0)amount=220*(int)(distance/500);
            else amount=220*(int)(distance/500)+220;
        }
        else if(weight>6&&weight<=10){
            if(distance<500)amount=370;
            else if(distance%500==0)amount=370*(int)(distance/500);
            else amount=370*(int)(distance/500)+370;
        }
        else {
            if(distance<500)amount=480;
            else if(distance%500==0)amount=480*(int)(distance/500);
            else amount=480*(int)(distance/500)+480;
        }
        System.out.println("Total charges will be: "+amount);
    }

    public static void main(String[] args) {
        System.out.print("Enter weight: ");
        Scanner scan=new Scanner(System.in);
        double weight=scan.nextDouble();
        System.out.print("\nEnter distance: ");
        double distance=scan.nextDouble();
        new ShippingCharges(weight,distance);
    }
}
