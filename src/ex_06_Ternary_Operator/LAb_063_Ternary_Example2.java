package ex_06_Ternary_Operator;

public class LAb_063_Ternary_Example2 {
    public static void main(String[] args) {

        // Check number is positive or negative

        int num=10;
        String result= (num>0) ? "Positive" : "Negative";
        System.out.println(result);

        int num1=-1;
        String result1= (num1>0) ? "Positive" : "Negative";
        System.out.println(result1);

        int num2=0;
        String result2= (num2>=0) ? "Positive" : "Negative";
        System.out.println(result2);
    }
}
