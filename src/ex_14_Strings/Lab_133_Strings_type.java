package ex_14_Strings;

public class Lab_133_Strings_type {

    public static void main(String[] args) {

        // There are 2 types of Strings
        //Mutable --> which can be changed
        //Immutable --> which cannot be changed

        //1. String Constant Pool
        String name = "Saurav"; // Saurav will be stored in SCP
        System.out.println(name);

        //2. Object Area
        String name1  = new String("Bhandare"); // Bhandare will be stored in OA
        System.out.println(name1);




    }
}
