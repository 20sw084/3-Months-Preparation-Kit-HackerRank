package com.java;

import java.util.Scanner;

/*
MUET bookseller has a book club that awards points to his customers
based on the number of books purchased each month. The points are awarded
as follows:
* If a customer purchases 0 books, he or she earns 0 points.
* If a customer purchases 1 book, he or she earns 5 points.
* If a customer purchases 2 books, he or she earns 15 points.
* If a customer purchases 4 or more books, he or she earns 60 points.

Write a program that asks the user to enter the number of books that he or she
has purchased this month and then displays the number of points awarded.
 */
public class BCP {
    public BCP(int books){
        if(books<0) System.out.println("Number of books should be either 0 or positive");
        else if(books==0) System.out.println("The customer has earned 0 points");
        else if(books==1) System.out.println("The customer has earned 5 points");
        else if(books==2||books==3) System.out.println("The customer has earned 15 points");
        else System.out.println("The customer has earned 60 points");
    }

    public static void main(String[] args) {
        System.out.println("Enter number of books purchased in one month");
        Scanner scanner=new Scanner(System.in);
        int books=scanner.nextInt();
        new BCP(books);
    }
}
