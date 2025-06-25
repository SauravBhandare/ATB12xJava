package ex_22_Super_Abstraction;

public class LAb_188_Abstraction_Example4 {
    public static void main(String[] args) {
        Familyy f3 = new Familyy();
        f3.call_family();
    }

}

class Familyy implements Dad,Mom{

    void call_family(){
        System.out.println("Familyy");
        d1();
        m1();
        home();
       name();
    }

    @Override
    public void d1() {
        System.out.println("d1");
    }

    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void home() {
        System.out.println("Common home");
    }

    @Override
    public void name() {
      //  Dad.super.name();
        Mom.super.name();
    }

    // @Override
   // public void name() {
      //  Dad.super.name();
       // Mom.super.name();
    }


interface Dad {
    void d1();
    void home();
    default void name(){
        System.out.println("My name is Kishor");
    }

}

    interface Mom {
        void m1();
        void home();
        default void name(){
            System.out.println("My name is Bharti");
        }
    }


