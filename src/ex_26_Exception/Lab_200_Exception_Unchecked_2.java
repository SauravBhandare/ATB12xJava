package ex_26_Exception;

public class Lab_200_Exception_Unchecked_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        //int c = a / b;
      //  System.out.println(c); // Unchecked --> Arithmetic exception


        String name = null;
        name.trim();
        System.out.println(name);  // Unchecked --> NullPointerException

    }
}
