package ex_26_Exception;

import java.io.FileInputStream;

public class Lab_205_Multiple_trycatch_exception4 {
    public static void main(String[] args) {

        int a = 10;
        int b = 0 ;
        int c = 0;
        try {
         //   c = a/b;
           // String st = null;
           // st.trim();
            FileInputStream fs = new FileInputStream("C://opt.txt");
        }
        // If there is ArithmeticException below code will be executed
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException found ");
            System.out.println(e.getMessage());
        }
        // If there is NullPointerException below code will be executed
        catch (NullPointerException e) {
            System.out.println("NullPointerException found ");
            System.out.println(e.getMessage());
        }
        // If none of above Exception is found below code will be executed
        catch (Exception e) {
            System.out.println("None of above Exception found ");
            System.out.println(e.getMessage());
        }


    }
}
