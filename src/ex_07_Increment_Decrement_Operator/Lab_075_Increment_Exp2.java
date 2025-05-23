package ex_07_Increment_Decrement_Operator;

public class Lab_075_Increment_Exp2 {

    public static void main(String[] args) {

        int a = 45 ;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // ERT  Expression and Result Table

        /*
        Line_no  | A | Exp
        7        | 45 | NA
        8        | NA   | (a++)45 -->  a=46 --> (++a)47
        9        | 47  | NA

        A+B
        A = a++ = 45  ---> a = 46
        B = ++a =47
        (45+47)= 92
         */
    }
}
