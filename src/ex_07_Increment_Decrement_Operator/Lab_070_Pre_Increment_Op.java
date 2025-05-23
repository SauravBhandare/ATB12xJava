package ex_07_Increment_Decrement_Operator;

public class Lab_070_Pre_Increment_Op {

    public static void main(String[] args) {

        // Pre Increment --> First increment and then store the result

        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        // ERT  Expression and Result Table
       /*
       line_no  | a  |  b
       9        | 10  | NA
       10       |  11  | 11
       11       | 11  | NA
       12       | NA  | 11

        */
    }
}
