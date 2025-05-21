package ex_05_TypeCasting;

public class Lab_059_Typecasting_Narrowing {

    public static void main(String[] args) {

        // Implicit Narrowing
       // int a=300;
       // byte b= a;  // Narrowing storing larger datatype into smaller datatype
        // There will be data loss
       // System.out.println(a);

        //Explicit Narrowing
        int c=300;
        byte b1= (byte) c;  //  // Narrowing storing larger datatype into smaller datatype
        // There will be data loss
        System.out.println(b1);



    }
}
