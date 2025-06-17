package ex_20_Polymorphism.method_overloading;

public class Lab_179_Method_overloading {
    public static void main(String[] args) {

        MathFunctions m1= new MathFunctions();
        System.out.println("Addition of a+b: " + m1.add(10,20) );
        System.out.println("Addition of a+b+c :" + m1.add(10,20,30));
        System.out.println("Addition of a+b : " + m1.add(10.10,20.20));
        System.out.println( "Addition of a+b+c : " + m1.add(10.10,20.20,30.30));

    }
}
