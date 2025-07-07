package ex_26_Exception;

public class Lab_208_throws_Exception_unchecked {
    public static void main(String[] args) throws Exception {


       // Giving exception to my function
        String st = args[0];
        int a = Integer.parseInt(st);
        int b = a/0;

    }
}
