package com.java;
import java.util.Scanner;


/*
* Write a java program to display list of South Asian Association
* for Regional Cooperation (SAARC) countries and ask user
* to select any country then display Capital of that country and
* also its currency. Use switch statement*/
public class SAARCDemo {
    public static void main(String[] args) {
        int x;
        do {
            System.out.println("\nList of SAARC countries\n");
            System.out.println("1.Pakistan");
            System.out.println("2.India");
            System.out.println("3.Sri Lanka");
            System.out.println("4.Bangladesh");
            System.out.println("5.Bhutan");
            System.out.println("6.Nepal");
            System.out.println("7.Maldives");
            System.out.println("8.Afghanistan");
            System.out.println("Enter 0 for exit.");
            System.out.println("Select any country: ");
            Scanner scan = new Scanner(System.in);
            x = scan.nextInt();
            switch (x)
            {
                case 0:
                    System.out.println("Exiting program.....");break;
                case 1:
                    System.out.println("Capital: Pakistan\nCurrency: Rupee");break;
                case 2:
                    System.out.println("Capital: New Delhi\nCurrency: Rupee");break;
                case 3:
                    System.out.println("Capital: Colombo\nCurrency: Rupee");break;
                case 4:
                    System.out.println("Capital: Dhaka\nCurrency: Taka");break;
                case 5:
                    System.out.println("Capital: Timphu\nCurrency: Ngultrum");break;
                case 6:
                    System.out.println("Capital: Kathmandu\nCurrency: Rupee");break;
                case 7:
                    System.out.println("Capital: Male\nCurrency: Rufiyaa");break;
                case 8:
                    System.out.println("Capital: Kabul\nCurrency: Afghani");break;
                default:
                    System.out.println("Enter correct number.");break;

            }
        }while(x!=0);

    }
}
