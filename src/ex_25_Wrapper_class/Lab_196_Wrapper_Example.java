package ex_25_Wrapper_class;

public class Lab_196_Wrapper_Example {
    public static void main(String[] args) {

        int a =10 ;   //
        Integer a1 = 110;  // Wrapper class

        System.out.println(a1.intValue());
        System.out.println(a1.equals(a));


        String name = "Saurav";
        Integer salary = 20000;
        Character c = 'A';
        Float phone = 70393032f;
        Boolean is_Married  = true;

        System.out.println(String.format(name));
        System.out.println(Integer.reverse(salary));
        System.out.println(Character.charCount(c));
        System.out.println(Float.isFinite(phone));
        System.out.println(Boolean.getBoolean(String.valueOf(is_Married)));




    }
}
