package ex_07_Increment_Decrement_Operator;


public class Lab_074_Increment_Exp1 {

    public static void main(String[] args) {

        int a = 32;
        System.out.println(++a + a);
        System.out.println(a);

        // ERT   Expression and Result Table
        /*
        Line_No | a | Exp
           7    | 32 | NA
           8    | 33  | (++a)33
           9    | 33  | NA

           A + B
           A = a++ = 33
           B = a = 33
         */
    }
}
