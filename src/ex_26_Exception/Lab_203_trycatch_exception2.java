package ex_26_Exception;

public class Lab_203_trycatch_exception2 {
    public static void main(String[] args) {

        String s1 = null ;
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());  // just prints the message in output
            e.printStackTrace();  //prints detail exception in output
        }
        System.out.println(s1);


    }
}
