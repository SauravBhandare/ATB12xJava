package ex_11_while_loop;

import java.util.Scanner;

public class Lab_121_while_Factorial {

    public static void main(String[] args) {

        //Logic Building Formula
        //Step 1: Check the datatype of input and output
        //Step 2: Write rough logic
        //Step 3: Write proper logic
        //Step 4: Optimize the code
        //Step 5: Edge cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for factorial");

        if(!scanner.hasNextInt()) // To check if the number is integer or not
        {
            System.out.println("Enter a valid integer and rerun the program");
        }

        int number = scanner.nextInt();
        int factorial =1;
        if (number<=0)
        {
            System.out.println(factorial);
        }

        int i=1;
        while(i<=number)
        {
            factorial=factorial*i;
            i++;
        }
        System.out.println(factorial);

    }
}
