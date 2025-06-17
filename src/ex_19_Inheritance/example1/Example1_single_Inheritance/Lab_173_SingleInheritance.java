package ex_19_Inheritance.example1.Example1_single_Inheritance;

public class Lab_173_SingleInheritance {

    public static void main(String[] args) {

        // Son can access Father as it extends Father class
        Son s1= new Son();
        System.out.println(s1.property);
        System.out.println(s1.money);
        s1.house();
        s1.house1();

        // Cousin cannot access Father as it does not extends Parent class
        Cousin c1= new Cousin();
        c1.house2();

    }
}
