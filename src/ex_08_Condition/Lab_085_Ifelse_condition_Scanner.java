package ex_08_Condition;

import java.util.Scanner;

public class Lab_085_Ifelse_condition_Scanner {

    public static void main(String[] args) {


        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);  //If int is not passed by user InputMismatchException error will occur
        int age = scanner.nextInt();

        if(age>18)
        {
            System.out.println("He can Vote");
        }
        else
        {
            System.out.println("He cannot vote");
        }

    }
}
