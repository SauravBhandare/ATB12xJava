package ex_06_Ternary_Operator;

public class Lab_064_Nested_Ternary {

    public static void main(String[] args) {

        // If age is greater than 18 he can go goa and if his age is greater than 21 he can also drink in goa ,
        // if less than 18 he cant go goa

        int age=22;
        String result= (age>18) ? ((age>21)? "Go to Goa and Drink also" : "Go to Goa but cannot Drink") : "Cant go to Goa";
        System.out.println(result);

        int age1=16;
        String result1= (age1>18) ? ((age1>21)? "Go to Goa and Drink also" : "Go to Goa but cannot Drink") : "Cant go to Goa";
        System.out.println(result1);

        int age2=18;
        String result2= (age2>=18) ? ((age2>21)? "Go to Goa and Drink also" : "Go to Goa but cannot Drink") : "Cant go to Goa";
        System.out.println(result2);


        int age3=20;
        String result3= (age3>=18) ? ((age3>21)? "Go to Goa and Drink also" : "Go to Goa but cannot Drink") : "Cant go to Goa";
        System.out.println(result3);


    }
}
