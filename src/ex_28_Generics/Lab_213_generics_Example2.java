package ex_28_Generics;

public class Lab_213_generics_Example2 {
    public static void main(String[] args) {
        Generic_class g1= new Generic_class(10);
        System.out.println(g1);
        Generic_class g2 = new Generic_class(3.14);
        System.out.println(g2);
        Generic_class g3 = new Generic_class("Saurav");
        System.out.println(g3);
    }
}
class  Generic_class <T>{
    private T value1;


    public Generic_class(T value1) {
        this.value1 = value1;
    }

    public T getValue1() {
        return value1;
    }

    @Override
    public String toString() {
        return "Generic_class holding value: " + value1;
    }
}

