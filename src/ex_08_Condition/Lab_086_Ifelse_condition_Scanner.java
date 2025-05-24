package ex_08_Condition;

import java.util.Scanner;

public class Lab_086_Ifelse_condition_Scanner {
    public static void main(String[] args) {

        System.out.println("Check Person Identity by Age");

        Scanner scanner =new Scanner(System.in);
        int age= scanner.nextInt();

        if(age<18)
        {
            System.out.println("Minor");
        }
        else if (age>65)
        {
            System.out.println("Old");
        }
        else
        {
            System.out.println("Adult");
        }


    }
}
