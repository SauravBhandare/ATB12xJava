package ex_08_Condition;


import java.util.Scanner;

public class Lab_087_Ifelse_condition_Task1 {

    //Write a program that classifies a triangle based on its side lengths.
    // Given three input values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal),
    // isosceles (exactly two sides are equal), or scalene (no sides are equal).
    // Use an if-else statement to classify the triangle.

    public static void main(String[] args) {

        System.out.println("Enter the lengths of side");

        Scanner scanner =new Scanner(System.in);
        int l1 = scanner.nextInt();
        int l2 = scanner.nextInt();
        int l3 = scanner.nextInt();

        if (l1 == l2 && l2 == l3)
        {
            System.out.println("Equilateral Triangle");
        }
        else if (l1!=l2 && l2!=l3)
        {
            System.out.println("Scalene Triangle");
        }
        else
        {
            System.out.println("Isosceles Triangle");
        }


    }
}
