package ex_07_Increment_Decrement_Operator;

public class Lab_072_Post_Increment_Op {

    public static void main(String[] args) {

        // Post Increment  --> First assign and then increment

        int a = 30;
        int b =  a++ ;
        System.out.println(a);
        System.out.println(b);

        // ERT   Expression and Result Table
        /*
        Line_no   a  |  b
        7       | 30 | NA
        8       | 31 | 30
        9       | 31 | NA
        10      | NA | 30
         */
    }
}
