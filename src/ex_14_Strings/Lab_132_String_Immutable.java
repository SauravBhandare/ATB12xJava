package ex_14_Strings;

public class Lab_132_String_Immutable {

    public static void main(String[] args) {

        // Immutable --> cannot be changed

        // SCP -- String constant pool (Every String created will be stored in SCP)


        String name ="Saurav";  // SCP  --> Saurav
        name.toUpperCase();  // SAURAV
        System.out.println(name);  // Saurav wil be printed bcoz we havent assigned to uppercase


        String name1 = "Bhandare"; // SCP --- Bhandare
        name1 = name1.toUpperCase(); // BHANDARE
        System.out.println(name1); // BHANDARE will be printed bcoz we have assigned to uppercase

    }
}
