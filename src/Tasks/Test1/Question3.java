package Tasks.Test1;

public class Question3 {
    public static void main(String[] args) {

        int a =10;
        int b=5;

        System.out.println("a is equal to b :"  + (a==b));
        System.out.println("a is not equal to b :"  + (a!=b));
        System.out.println("a is less than b :"  + (a<b));
        System.out.println("a is greater than b :"  + (a>b));
        System.out.println("a is less than equal to b :"  + (a<=b));
        System.out.println("a is greater than equal to b :"  + (a>=b));

        System.out.println(" a && b :" + ((a >b) && (a>0)));
        System.out.println(" a || b :" + ((a < b) || (a>0)));
        System.out.println(" a ! b :" +  ! (a > b));


    }
}
