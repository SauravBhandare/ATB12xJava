package ex_26_Exception;

import java.util.Scanner;

public class Lab_210_Custom_exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int userAge = sc.nextInt();

        try {
            age(userAge);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }

    static void age(int age) throws Exception {
        if (age < 18) {
            throw new Exception("I cannot Vote");
        } else {
            System.out.println("I Can Vote");
        }
    }
}
