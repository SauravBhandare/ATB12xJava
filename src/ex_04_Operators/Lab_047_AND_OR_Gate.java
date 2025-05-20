package ex_04_Operators;

public class Lab_047_AND_OR_Gate {

    /*
    AND GATE
    A    B   res
    0    0   0
    0    1   0
    1    0   0
    1    1   1

    OR GATE
    A    B   res
    0    0   1
    0    1   1
    1    0   1
    1    1   0
    */

    public static void main(String[] args) {


        System.out.println(true && true); // TRUE
        System.out.println(true && false); //FASLE
        System.out.println(false && true); //FALSE
        System.out.println(false && false); //FALSE


        System.out.println(true || true); // True
        System.out.println(true || false); //True
        System.out.println(false || true); //True
        System.out.println(false || false); //FALSE
    }

}
