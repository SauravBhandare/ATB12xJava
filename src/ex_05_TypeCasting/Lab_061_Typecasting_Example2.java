package ex_05_TypeCasting;

public class Lab_061_Typecasting_Example2 {

    public static void main(String[] args) {

        int salary=1000;
        float gst =18.5f;

        //Widening Implicit
        float total1= salary+gst;
        System.out.println(total1);

        //Widening Explicit
        float total2= (float) salary+gst;
        System.out.println(total2);


        //Implicit Narrowing
       // int total3 = salary+gst;   // Implicit narrowing is not possible
      //  System.out.println(total3);


        //Explicit Narrowing
        int total4=  salary+ (int)gst; // Here the after decimal values will be ignored bcoz we are converting float dattaype into int
        System.out.println(total4);

    }
}
