package ex_26_Exception;

public class Lab_207_finally_trycatch_exception6 {
    public static void main(String[] args) {

        String str = args[0];
        int a = Integer.parseInt(str);
        try {
            int b = a/0;
        }
        // Use Exception if we dont know which type of exception will occur in Runtime
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Final blog will be always executed");
        }


    }
}
