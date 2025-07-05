package ex_25_Wrapper_class;

public class Lab_198_Wrapper_conversion {
    public static void main(String[] args) {

        String num = "25";
        int a = 10;  // primitive data type

        // Converting String into a wrapper class
        Integer i = Integer.parseInt(num);
        System.out.println(i);


        // Converting wrapper class into primitive (Unboxing)
        int i2= Integer.parseInt(num);
        System.out.println(i2);


        // Converting primitive to Wrapper class
        Integer c= Integer.parseInt(String.valueOf(a));
        System.out.println(a);
    }
}
