package ex_11_while_loop;

import java.util.Random;
import java.util.Scanner;

public class Lab_122_while_number_Guessing {

    public static void main(String[] args) {


        Random random = new Random();
        int numtoguess = random.nextInt(100) + 1;
        //System.out.println(numtoguess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int guess;
        int attempts = 1;

        while (true) {
            guess = scanner.nextInt();
            attempts++;

        if (guess < numtoguess) {
            System.out.println("Too less number");
        } else if (guess > numtoguess) {
            System.out.println("To high number");
        } else {
            System.out.println("Correct! You found it  " +  attempts  +  "  Number of attempts");
            break;
        }



    }
    }
}
