package com.java;

import java.util.Scanner;


/*
Write a java program to ask user to enter his or her email
and then check whether the entered email is valid or not
The format of email should be like: abc123@gmail.com
 */
public class EmailValidation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your gmail: ");
        String email=scan.nextLine();
        int lastIndex=email.length()-1;
        String sub=email.substring(lastIndex-9);
        if(sub.equals("@gmail.com")){
                int c=email.charAt(0);
                if((c>64&&c<91)||(c>96&&c<123)){
                    char[] s=email.toCharArray();
                    for(char c1:s)if(Character.isDigit(c1)){
                    System.out.println("Your email is correct");
                    System.exit(0);
                    }
                    System.out.println("Must include numeric values");
                    main(null);
                }else{
                    System.out.println("Must start with english alphabet");
                    main(null);
                }

        }else{
            System.out.println("must be include(or end with) '@gmail.com' in your gmail");
            main(null);
        }
    }
}
