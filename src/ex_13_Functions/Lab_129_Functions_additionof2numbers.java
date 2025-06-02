package ex_13_Functions;

public class Lab_129_Functions_additionof2numbers {

    public static void main(String[] args) {
         //calling

        int result = sum_of_two_number(3,4);
        System.out.println(result);
        int result2 = sum_of_two_number(31,42);
        System.out.println(result2);
        int result3 = sum_of_two_number(37,14);
        System.out.println(result3);

    }

    //Defining

     static int sum_of_two_number (int first , int second)
    {
        System.out.println("Sum of two number is :");
        return first+second;
    }
}
