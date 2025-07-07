package ex_26_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_201_Exception_checked {
    public static void main(String[] args) {

        // Checked exception
        // JVM knows about it . During compilation there can be case where file is not found
        // FileInputStream is a class which can read the file content

        try {
            FileInputStream fs = new FileInputStream("C://log.txt");
        } catch (FileNotFoundException e) {
            System.out.println("If file is not found print this message");
            System.out.println(e.getMessage());

        }
    }
}
