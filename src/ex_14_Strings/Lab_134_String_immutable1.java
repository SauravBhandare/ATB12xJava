package ex_14_Strings;

public class Lab_134_String_immutable1 {

    public static void main(String[] args){

        String name = "Saurav";  //SCP  --> Saurav
        name.concat("Bhandare");  // SCP --> SauravBhandare
        System.out.println(name);  // Saurav will be printed bcoz we havent assigned name


        String name1= "Test";  // SCP --> Test
        name1 = name1.concat("123"); // SCP --> Test123
        System.out.println(name1);  // Test123 will be printed bcoz we have assigned name1


    }
}
