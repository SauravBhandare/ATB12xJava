package Tasks;

import java.util.Scanner;

public class Task_1_Switch {
    public static void main(String[] args) {


        //Write a Java program that takes a month number (1-12) and prints the number of days in that month using a switch statement. Handle February separately for leap years.
        //a year is a leap year if it is divisible by 4, but not by 100, unless it is also divisible by 400.
        //Input -> 1 to 12, and Year = 2025
        //-> 1 and year 2025 -> 31 Days
        //-> 2 and year 2025 -> 28 Days, ( 2025 leap)


        //Logic building formula
        /*
        Step 1 : We will use the scanner class as we are taking the input from user
        Step 2 : We will figure out the expression and the grade
        Step 3 : We will write the rough logic
        Step 4 : We will write the logic of the program and optimize it
        Step 5 : We will cover edge cases
         */

        // Step 1: Use Scanner to take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month number 1-12:");
        int month = scanner.nextInt();
        System.out.println("Enter a year");
        int year = scanner.nextInt();

        // Step 2: Use switch statement to determine days in month
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
            {
                System.out.println("The month has 31 days");
                break;
            }
            case 4, 6, 9, 11: {
                System.out.println("The month has 30 days");
                break;
            }
            case 2: {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0)) {
                    System.out.println("The Year is a leap year and has 29 days");
                } else {
                    System.out.println("The year is not a leap year");
                }
                break;
            }

        default: {
            System.out.println("Enter a valid number in month");
        }
        //   scanner.close();
    }





    }
}
