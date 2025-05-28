package ex_09_Switch;

import java.util.Scanner;

public class Lab_088_Switch {
    public static void main(String[] args) {

        // You need to take a user input and ask them to enter integer from 1-7
        // If the user enters integer from 1 to 7
        // You will tell which day it is

        //Logic building formula
        /*
        Step 1 : We will use the scanner class as we are taking the input from user
        Step 2 : We will figure out the expression and the day
        Step 3 : We will write the rough logic
        Step 4 : We will write the logic of the program and optimize it
        Step 5 : We will cover edge cases
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer from 1 to 7");

        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;

                default:
                    System.out.println("Enter integer from 1 to 7 only");

            }
        } else {
            System.out.println("You are allowed to enter only integers");
        }
    }
}

