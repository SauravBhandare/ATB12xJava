package ex_20_Polymorphism.method_overloading;

public class MathFunctions {

    int add(int a, int b) {
        return a+b;
    }

    int add(int a,int b, int c){
        return a+b+c;
    }

    double add(double a , double b)
    {
        return a+b;
    }

    double add (double a, double b, double c){
        return a+b+c;
    }

}
