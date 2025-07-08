package ex_28_Generics;

public class Lab_212_Generics_Example1 {
    public static void main(String[] args) {

        // By calling multiple methods with different return types

       Integer result = sum_values(10,20);
        System.out.println("Addition of a+b: "  +  result);
        Double result1 = sum_values(3.1,4.5);
        System.out.println("Addition of a+b: " + result1);
       String result2 = sum_values("Saurav","Bhandare");
        System.out.println("Addition of a+b: " + result2);
    }

    static Integer sum_values(Integer a, Integer b) {
        return a+b;
    }
   static Double sum_values(Double a,Double b){
        return a+b;
    }
    static String sum_values(String a,String b){
        return a+b;
        
    }



}
 
