package ex_07_Increment_Decrement_Operator;

public class Lab_071_Pre_Increment_Op {

    public static void main(String[] args) {

        int a = 20;
        int b = ++a ;
        int c = ++b ;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // ERT  Expression and Result Table
        /*  Line_no  | a | b | c
             7       | 20 | NA | NA
             8       | 21 | 21 | NA
             9       | 21 | 22 | 22
             10      | 21  | NA | NA
             11      | NA  | 22 | NA
             12      | NA  | NA | 22

         */
    }
}
