package ex_07_Increment_Decrement_Operator;

public class Lab_081_Inc_Dec_Op_Task3 {

    public static void main(String[] args) {

        int i = 1 , j = 2 , k = 3;
        int m = i-- - j-- -k--;

        System.out.println("i=" +i + ",j=" +j+ ",k=" +k+ ",m="+m);

        //ERT  Expression and Result Table

        /*
        Line No  | i  | j | k  | m
        7        | 1  | 2  | 3 | NA
        8        | NA  | NA | NA  | (i--)1 --> i=0 ---> (j--)2 --> j=1 --> (k--)3 -->k=2
        m = 1-2-3 =-4


         */
    }
}
