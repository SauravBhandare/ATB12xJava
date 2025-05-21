package ex_06_Ternary_Operator;

public class Lab_068_Nested_Ternary_Task3 {

    public static void main(String[] args) {

        // Use Nested Ternary and check if I am Adult, minor or Senior
        //COndition is if my age is greater than 18 I can be Adult, minor or Senior
        //But if age is greater than 65 then I am senior and if between 18 to 65 I am adult


        /*
        age<18 --> Minor
        age from 18 to 65 --> Adult
        age > 65 --> Senior
         */


        int age =65;
        String result = (age>=18) ? ((age<=65) ? "I am an Adult" : "I am an Senior") : "I am Minor";
        System.out.println(result);
    }
}
