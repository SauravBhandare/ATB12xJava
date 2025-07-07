package ex_26_Exception;

public class Lab_206_Finally_trycatch_exception_5 {
    public static void main(String[] args) {
         String st = args[0];
         int a = Integer.parseInt(st);
        try {
            int b = a/0;
        } catch (ArithmeticException | NullPointerException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Final blog will be always executed ");
        }


    }
}
