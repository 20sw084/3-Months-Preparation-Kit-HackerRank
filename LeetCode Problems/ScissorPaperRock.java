package com.tayyaba;
import java.util.Random;
import java.util.Scanner;
public class ScissorPaperRock {
    public static void main(String[] args) {
        Random rn=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Choice number 0)Scissor  1)Paper  2)Rock");

        int draw=0;
       int userscore=0;
       int playerscore=0;
int user;
int count=0;
while(count<5){
    int com= rn.nextInt(3);
    switch (com) {
        case 0 -> {
            System.out.print("Input your token :");
            user = sc.nextInt();
            System.out.println("Player input" + com);
            if (user == 0) {
                draw++;
            } else if (user == 1) {
                playerscore++;
            } else if (user == 2) {
                userscore++;
            }
        }
        case 1 -> {
            System.out.print("Input your token :");
            user = sc.nextInt();
            System.out.println("Player input" + com);
            if (user == 0) {
                userscore++;
            } else if (user == 1) {
                draw++;
            } else if (user == 2) {
                playerscore++;
            }
        }
        case 2 -> {
            System.out.print("Input your token :");
            user = sc.nextInt();
            System.out.println("Player input" + com);
            if (user == 0) {
                playerscore++;
            } else if (user == 1) {
                userscore++;
            } else if (user == 2) {
                draw++;
            }
        }
    }
        count++;
        }
        System.out.println("your score");
        System.out.println("Draw :"+draw);
        System.out.println("Score:"+userscore);
        System.out.println("Player score");
        System.out.println("Draw :"+draw);
        System.out.println("Score:"+playerscore);
        if (userscore>playerscore){
            System.out.println("You Win *******");
        }
        else if(userscore<playerscore){
            System.out.println("Your Adversary win");
        }
        else {
            System.out.println("Draw");
        }




    }
}
