package Tasks;

import java.util.Scanner;

public class Task_3_for_loop_factorial {
    public static void main(String[] args) {

        //ICU
        // Initialization --> Condition --> Updation


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for factorial");

        //if(scanner.hasNextInt())  // to check if the number is integer

        int number = scanner.nextInt();
        int factorial = 1;
        if (number == 0) {
            factorial = 1; // If number is 0 factorial should be 1
        }

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
