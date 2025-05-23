package ex_07_Increment_Decrement_Operator;

public class Lab_069_Inc_Dec_Operators {

    public static void main(String[] args) {

        String age_string=  args[0];
        String str2 = args[1];
        String str3 = args[2];


        int i1= Integer.parseInt(age_string);
        int i2= Integer.parseInt(str2);
        float f1 = Float.parseFloat(str3);


        System.out.println(age_string);
        System.out.println(str2);
        System.out.println(str3);

         //If the arguments are less than --> java.lang.ArrayIndexOutOfBoundsException will occur
    }
}
