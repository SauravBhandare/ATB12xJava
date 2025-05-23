package ex_07_Increment_Decrement_Operator;

public class Lab_079_IncDec_Op_Task1 {

    public static void main(String[] args) {

        int i = 11;
        i= i++ + ++i;
        System.out.println(i);

        //ERT  Expression and Result Table

       /*
        Line_no  | A  | exp
           7     | 11  | NA
           8     |  NA  |  (i++)= 11  --> i =12 ---> 13




        */
    }
}
