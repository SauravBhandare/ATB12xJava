package ex_26_Exception;

public class Lab_199_Exception_Unchecked {
    public static void main(String[] args) {

        // JVM dont know there is a exception . It is a runtime exception which means its unchecked exception

        // If we pass blank and run the program it will throw an error ArrayIndexOutOfBoundsException at runtime
        String st = args[0]; // ArrayIndexOutOfBoundsException
        // If we pass String(Saurav) and run the program it will throw an error NumberFormatException (It is expecting a number in input)
        int a = Integer.parseInt(st); // NumberFormatException
        // If we pass 0 and run the program it will throw an error ArithmeticException
        int b = 100/a; //ArithmeticException




    }
}
