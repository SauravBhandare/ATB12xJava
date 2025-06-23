package ex_22_Super_Abstraction;

import org.w3c.dom.ls.LSOutput;

public class Lab_185_Abstraction_Example1 {

    public static void main(String[] args) {

        Son s1 = new Son();
        s1.loan50k();
    }
}
    class Emptyclass {
        //Concrete class  --> EMpty class

    }

    abstract class Father {
        abstract void loan50k();
    }


    class Son extends Father {

        @Override
        void loan50k() {
            System.out.println("Loan Repaid by Son");
        }


    }





