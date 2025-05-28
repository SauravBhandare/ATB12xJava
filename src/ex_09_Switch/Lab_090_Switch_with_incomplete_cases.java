package ex_09_Switch;

import java.util.Scanner;

public class Lab_090_Switch_with_incomplete_cases {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values from 1 to 7");
        int day = scanner.nextInt();

        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;

        }

    }
}
