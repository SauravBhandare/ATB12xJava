package ex_16_Arrays;

import java.util.Scanner;

public class Lab_156_Array_taking_userinput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();

       String[] names = new String[size];

       for (int i =0 ; i< names.length ; i++) {
           System.out.println("Enter the names of Students : " + i);
           names[i] = scanner.next();
       }

        System.out.println("The names of the Students are");
       // Printing all the inputs together
       for ( String name : names)
           System.out.println(name);

       scanner.close();
    }
}
