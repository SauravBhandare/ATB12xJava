package ex_05_TypeCasting;

public class Lab_060_Typecasting_Example1 {

    public static void main(String[] args) {


        //Narrowing
        long l= 8898789098l;
       // short s= l;  // Implicting narrowwing is not possible
        short s= (short) l; // Explicit narrowing is possible but there will be a data loss
        System.out.println(s);



    }
}
