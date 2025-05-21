package ex_06_Ternary_Operator;

public class Lab_067_Nested_Ternary_Task2 {
    public static void main(String[] args) {

        //Use nested ternery having 3 numbers and finding the greatest among them

        int N1=30;
        int N2=45;
        int N3=20;

        String result= (N1>N2) ? ((N1>N3) ? "N1 is greatest" : "N3 is greatest") : ((N2>N3) ? "N2 is Largest" :  "N3 is gretaest");
        System.out.println(result);
    }
}
