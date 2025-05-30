package Tasks;

import java.awt.*;
import java.util.Scanner;

public class Task_2_Switch {
    public static <string> void main(String[] args) {

        // 'A':  "Excellent";
        //             'B': return "Very Good";
        //            'C': return "Good";
        //             'D': return "Needs Improvement";
        //             'F': return "Fail";
        //            : return "Invalid grade";

        //Logic building formula
        /*
        Step 1 : We will use the scanner class as we are taking the input from user
        Step 2 : We will figure out the expression and the grade
        Step 3 : We will write the rough logic
        Step 4 : We will write the logic of the program and optimize it
        Step 5 : We will cover edge cases
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Grade");

        String Grade = scanner.next();

        switch (Grade) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Very Good");
                break;
            case "C":
                System.out.println("Good");
                break;
            case "D":
                System.out.println("Needs Improvement");
                break;
            case "E":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade");
        }
    }
}
