package ex_04_Operators;

public class Lab_043_Interview_Concat_2 {

    public static void main(String[] args) {

        String s1="Saurav";
        String s2="Bhandare";

        int a=10;
        int b=12;

        System.out.println(s1+s2+a+b);  //SauravBhandare1012 as output bcoz first operator is used as a joiner
        System.out.println(a+b+s1+s2);  // 22SauravBhandare as output first it will add integers then act as a joiner for STring datatype
        System.out.println(s1+s2+(a+b)); //SauravBhandare22 as output first operator will act as a joiner and then other operator will add 2 integers



    }
}
