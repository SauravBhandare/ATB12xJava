package ex_07_Increment_Decrement_Operator;

public class Lab_080_IncDec_Op_Task2 {

    public static void main(String[] args) {

        int a = 11, b = 22 , c;
        c = a + b + a++ + b++ + ++a + ++b;
        System.out.println("a=" +a);
        System.out.println("b=" +b);
        System.out.println("c=" +c);

        // ERT  Expression and Result Table
        /*a
        Line_no  | A  | B | C
        7        | 11 | 22 | NA
        8        |    |    | (a+b)=33 --> c=33 --> (a++)11 --> a=12 --> (b++)22 --> b=23 --> (++a)13 --> (++b)24

        (a+b)33 + (a++)11 + (b++)22 + (++a)13 + (++b)24 = 103
         */
    }
}
