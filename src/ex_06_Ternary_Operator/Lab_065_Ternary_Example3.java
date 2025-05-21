package ex_06_Ternary_Operator;

public class Lab_065_Ternary_Example3 {

    public static void main(String[] args) {

        // Find greatest of 2 numbers

        int a=10;
        int b=11;

        String result = (a>b) ? "A is greater" : "B is Greater";
        System.out.println(result);


        boolean b1= true;
        boolean b2=false;


        String result1 = (b1==b2) ? "True" : "false";
        System.out.println(result1);

        String result2 = (b1!=b2) ? "True" : "false";
        System.out.println(result2);
    }
}
