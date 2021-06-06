/*
 *  UCF COP3330 Summer 2021 Assignment 17 Solution
 *  Copyright 2021 Sabirah Salau
 */


package org.example;
import java.util.Scanner;

public class Problem17
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double rMen = 0.73;
        double rWomen = 0.66;
        double BAC;



        System.out.println("How much do you weigh in pounds?");
        String weight = input.next();
        while(!weight.matches("[0-9]+"))
        {
            System.out.println("Please enter numbers only:");
            weight = input.next();
        }
        double sWeight = Double.parseDouble(weight);




        System.out.println("Are you a male or female?");
        String gender = input.next().toLowerCase();




        System.out.println("How much alcohol have you consumed in ounces?");
        String consumed = input.next();

        while(!consumed.matches("[0-9]+"))
        {
            System.out.println("Please enter numbers only:");
            consumed = input.next();
        }
        double sConsumed = Double.parseDouble(consumed);




        System.out.println("How many hours has it been since your last drink?");
        String timePassed = input.next();

        while(!timePassed.matches("[0-9]+"))
        {
            System.out.println("Please enter numbers only:");
            timePassed = input.next();
        }
        double sTimePassed = Double.parseDouble(timePassed);



        if(gender.equals("male"))
        {
            BAC = ((sConsumed * 5.14)/(sWeight * rMen) - .015 * sTimePassed);

            if(BAC >= 0.8)
            {
                System.out.println("it is not legal for you to drive.");
                System.exit(0);
            }
            System.out.println("It is legal for you to drive.");
        }
        else if(gender.equals("female"))
        {
            BAC = ((sConsumed * 5.14)/(sWeight * rWomen) - .015 * sTimePassed);

            if(BAC >= 0.8)
            {
                System.out.println("it is not legal for you to drive.");
                System.exit(0);
            }
            System.out.println("It is legal for you to drive.");
        }
        else
        {
            System.out.println("Invalid gender input.");
        }


    }
}
