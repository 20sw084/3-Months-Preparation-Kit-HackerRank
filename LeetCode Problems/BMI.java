package com.java;
/*
Write a program that calculates and displays a person's body mass index(BMI)
The program should display weather the person is under-weight, overweight
or healthy. The BMI is often used to determine weather a person with a sedentary
lifestyle is overweight or under-weight for his or her height. A person's
BMI is calculated with the following formula:
BMI=weight*703/height^2
where weight is measured in pounds and height is measured in inches.
The program should display a message indicating weather the person has optimal weight,
is under-weight, or is overweight. A sedentary person's weight is considered to be
optimal if his or her BMI is between 18.5 and 25. If BMI is less than 18.5,
the person is considered to be underweight. If BMI value is greater than 25, the person is
considered to be overweight

 */
public class BMI {
    public BMI(double weight,double height){
        double bmi=(weight*703)/(height*height);
        if(bmi<=0){
            System.out.println("Illegal argument passed");
            return;
        }
        System.out.println("The person's body mass index is: "+bmi);
        if(bmi>18.5 && bmi<25) System.out.println("The person is healthy / has optimal weight");
        else if(bmi<18.5) System.out.println("The person is under-weight");
        else if(bmi>25) System.out.println("The person is over-weight");
    }

    public static void main(String[] args) {
        new BMI(0,15);
    }
}
