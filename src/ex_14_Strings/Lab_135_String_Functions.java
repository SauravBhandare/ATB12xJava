package ex_14_Strings;

public class Lab_135_String_Functions {

    public static void main(String[] args) {

        char c ='A';
        System.out.println(c);

        String name = "Saurav";  //SCP --> Saurav
        System.out.println(name);
        System.out.println(name.length());  //6
        System.out.println(name.toLowerCase());  //SCP --> saurav
        System.out.println(name.toUpperCase());  // SCP --> SAURAV
        System.out.println(name.concat("Bhandare"));  // SCP --> SauravBhandare

    }
}
