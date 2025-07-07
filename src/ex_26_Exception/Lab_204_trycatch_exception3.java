package ex_26_Exception;

public class Lab_204_trycatch_exception3 {
    public static void main(String[] args) {



        int a = 10;
        try {
            int b = a/0;
        } catch (ArithmeticException e) {
           // System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        catch (Throwable e) {
            System.out.println(e.getMessage());
        }

    }
}
