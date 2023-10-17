package com.java;

import java.util.Scanner;

/*
The distance a vehicle travels can be calculated as follows:
distance=speed*time
For example, if a train travels 40 miles per hour for three hours,
the distance traveled is 120 miles.
Write a program that asks the user for the speed of a vehicle(in miles per hour)
and how many hours it has traveled. The program should then use a loop to display
the distance the vehicle has traveled for each hour for that time period.
Here is an example of the output:
What is the speed of the vehicle in mph? 40
How many hours has it traveled? 3
Hour    Distance traveled
1       40
2       80
3       120

Input Validation: Do not accept a negative number for speed
and do not accept any value less than one for time traveled.
 */
public class DistanceTravelled {
    public DistanceTravelled(double speed,int hours){
        if(speed<0 || hours<1)throw new IllegalArgumentException();
        System.out.println("Hour     Distance Traveled\n");
        for(int i=1;i<=hours;i++)System.out.println(i+"     "+speed*i);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("What is the speed of the vehicle in mph? ");
        double speed=scan.nextDouble();
        System.out.print("\nHow many hours has it traveled? ");
        int hours=scan.nextInt();
        new DistanceTravelled(speed,hours);
    }
}
