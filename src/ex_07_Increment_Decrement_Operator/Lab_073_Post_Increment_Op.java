package ex_07_Increment_Decrement_Operator;

public class Lab_073_Post_Increment_Op {

    public static void main(String[] args) {

        // Post Increment --> First assign and then increment

        int a = 50;
        int b = a++ ;
        int c = b++ ;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //ERT   Expression and Result Table
        /*
        Line_no  |  A  |  B  | C
         9       | 50  | NA  | NA
         10      |  51  | 50 | NA
         11      |  NA  |  51 | 50
         */


    }
}
