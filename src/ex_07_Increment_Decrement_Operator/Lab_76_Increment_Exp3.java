package ex_07_Increment_Decrement_Operator;

public class Lab_76_Increment_Exp3 {

    public static void main(String[] args) {

        int a= 87;
        System.out.println(++a + ++a);
        System.out.println(a);

        // ERT Expression and Result table
        /*
        Line_no  | A | B
          7      | 87 | NA
          8      |  NA  | (++a)88 -->  a=88 --> (++a)89
          9      | 89  | NA

          A= ++a = 88  --> a=88
          B = ++a = 89
          88+89 = 177

         */
    }
}
