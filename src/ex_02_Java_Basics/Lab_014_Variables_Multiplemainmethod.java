package ex_02_Java_Basics;

public class Lab_014_Variables_Multiplemainmethod {

    public static void main(String[] args) {
        System.out.println("ABC");

    }
    //JVM can recognize only 1 main method
    public static void main(int args) {
        System.out.println("abc");
    }
}
