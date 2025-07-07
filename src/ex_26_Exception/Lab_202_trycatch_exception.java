package ex_26_Exception;

public class Lab_202_trycatch_exception {
    public static void main(String[] args) {
        int a =10;
        int b =0;
        int c= 0;
        try {
            c = a/b;  // If there is a problem execute catch blog
        } catch (Exception e) {
            System.out.println("Catch blog is going to be executed if try blog fails");
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
