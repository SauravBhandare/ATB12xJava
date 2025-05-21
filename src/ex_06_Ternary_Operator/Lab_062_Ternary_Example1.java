package ex_06_Ternary_Operator;

public class Lab_062_Ternary_Example1 {
    public static void main(String[] args) {

        // Check if age is greater than 18 then u can go goa or else u cant
        // result = Condition1 ? Statement1 : Statement2 ;

        int age =21;
        String result = (age>18) ? "Yes I can go to Goa" : "I cant go to Goa";
        System.out.println(result);

        int age1=16;
        String result1 = (age1>18) ? "Yes I can go to Goa" : "I cant go to Goa";
        System.out.println(result1);

    }
}
