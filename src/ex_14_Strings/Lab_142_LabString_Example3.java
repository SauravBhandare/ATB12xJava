package ex_14_Strings;

public class Lab_142_LabString_Example3 {

    public static void main(String[] args) {

        String s1 = "Saurav".substring(2); //String starting from 2
        System.out.println(s1);

        String s2 = "Bhandare".substring(5);
        System.out.println(s2);

        String s3 = "Bhandare".substring(8);
        System.out.println(s3);

        String s4 = "Bhandare".substring(0);
        System.out.println(s4);

        String s5 = "Saurav".substring(1,5);
        System.out.println(s5);

        String s6 = "Bhandare".substring(0,2);
        System.out.println(s6);

        String s7 = "   Saurav   ".trim();  // trim function removes empty spaces
        System.out.println(s7);

        String s8 = "Saurav".repeat(4);
        System.out.println(s8);

        String s9 = String.format("%s=%d","age",25);
        System.out.println(s9);
    }
}
