package ex_25_Wrapper_class;

public class Lab_197_Example2 {
    public static void main(String[] args) {


        //Boxing
        // Converting a normal integer or primitive datatype into Wrapper class or Integers it will give extra functionality .

        int a = 10;  // integer
        Integer b = a;  // Boxing // Integer means wrapper class  // JVM will do it automatically

        System.out.println(a);  // normal integer
        System.out.println(b.compareTo(a));  // If it is a wrapper class we can use multiple functions
        System.out.println(b.hashCode());

        // Unboxing
        // Converting the Wrapper class into primitive data types we will loose the functionality
        Integer c = 20;  // Integer or wrapper class
        int d = c;        // we will loose all the functions

        System.out.println(c.equals(d));  // If it is a wrapper class we can use multiple functions
        System.out.println(d);

    }
}
