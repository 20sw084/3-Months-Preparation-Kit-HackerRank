package com.java;


/*
The key value method uses codes for different methods and years to calculate the day
of the week.
Steps:
1) Take the last two digits of the year.
2) Divide it by four and discard any remainder.
3) Add the day of the month to the value obtained in step 2
4) Add the months key value, from the table to the value
   obtained in step 3
5) If the date is in January or February of a leap year,
   subtract 1 from step 4.
6) Add the year (century) code from the table
   Suppose the year is not in the above table. In this case we all have to do
   is add or subtract 400 until we have a year (century) that is in the table
   Then get the code for the year from the table and add the value to the
   previous step (our running total)
7) Add the last two digits of the year to the value we obtained in the
   previous step.
8) Divide this value by 7 and take the remainder. Get the day from the table
   based on the value of the remainder



   Find the day of today

Month --> Jan     Feb    Mar    April  May   June  July  Aug  Sep   Oct   Nov   Dec
Code -->  0       3      3      6      1     4     6     2    5      0    3      5

Year --> 1600-1699   1700-1799   1800-1899  1900-1999   2000-2099
Code -->     6          4           2           0          6
Day -->  Mon  Tue  Wed  Thu  Fri  Sat  Sun
Code --> 1     2   3    4    5    6    0

 */
public class DateDayRecognize {
    public DateDayRecognize(int year, int month, int date){
        String s=String.valueOf(year);
        int x =Integer.parseInt(s.substring(2));
        int y=x/4;
        y+=date;
        switch (month){
            case 2, 3, 11 -> y+=3;
            case 4,7->y+=6;
            case 5->y+=1;
            case 6->y+=4;
            case 8->y+=2;
            case 9,12->y+=5;
        }
        /*

           How to Know if Certain Year is a Leap Year
           The 3 conditions for a given year be a leap year are:

           1) The year is exactly divisible by four (with no reminder);
           2) If the year is divisible by 100 (years ending in two zeros), it is not a leap, except if
              It is also divisible by 400 (in this case it will be a leap year)
         */
        if(year%100==0){
            if(year%400==0 && month<3)y-=1;
        } else if(year%4==0 && month<3)y-=1;
        if(year<1600)while (year<1600)year+=400;
        else if (year>2099)while (year>2099)year-=400;
        if(year<1700)y+=6;
        else if(year<1800)y+=4;
        else if(year<1900)y+=2;
        else if(year>=2000)y+=6;
        s=String.valueOf(year);
        int z=Integer.parseInt(s.substring(2));
        y+=z;
        int today=y%7;
        switch (today){
            case 0-> System.out.println("Sunday");
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");

        }
    }

    public static void main(String[] args) {
        new DateDayRecognize(1,1,1);
    }
}