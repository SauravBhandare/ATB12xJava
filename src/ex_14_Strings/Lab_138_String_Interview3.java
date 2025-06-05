package ex_14_Strings;

public class Lab_138_String_Interview3 {
    public static void main(String[] args) {

        //SCP
        String s1 = "Test";  // SCP --> Test
        String s2= "Test";
        String s3= "test";  // SCP --> test

        // OA

        String s4 = new String ("Test");
        String s5 = new String ("Test");
        String s6 = new String ("test");

        // == --> Comparison --> STring -->  to check the location

        System.out.println(s1==s2); // true
        System.out.println(s1==s3); // false

        System.out.println(s4==s5);  // false
        System.out.println(s4==s6);  // false

        System.out.println(s1==s4);  // false
        System.out.println(s1==s6);  // false


        // equalsto  --> check String is same or not

        System.out.println(s1.equals(s2));  // true
        System.out.println(s1.equals(s3));  //false

        System.out.println(s4.equals(s5)); // true
        System.out.println(s4.equals(s6));  // false

        System.out.println(s1.equals(s4)); // true
        System.out.println(s1.equals(s6));  // false


        // equalsIgnoreCase (Saurav, saurav, SAURAV , SAurav) treates all same
        System.out.println(s1.equalsIgnoreCase(s3));  //true
        System.out.println(s4.equalsIgnoreCase(s6));  //true
    }
}
