package ex_16_Arrays;

import java.util.Scanner;

public class Lab_165_Right_angle_triangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();


        for (int i =0 ;i<number ; i++){
            for (int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
