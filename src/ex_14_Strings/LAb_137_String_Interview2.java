package ex_14_Strings;

public class LAb_137_String_Interview2 {
    public static void main(String[] args) {


        // SCP --> String Constant Pool

        // If String is already present in SCP it will replace the variable name
        String name = "Saurav";// SCP --> Saurav
        System.out.println(name);

        String name1= "Saurav";
        String name2= "Saurav";
        String name3= "SAURAV"; // SCP --> SAURAV
        String name4= "SAURAV";
        String name5= "saurav";  // SCP --> saurav

        // OA --> Object Area

        // If OA everytime a new String will be created

        String name6 = new String ("Bhandare");  // OA --> Bhandare
        System.out.println(name6);

        String name7 = new String("Bhandare");  // OA --> Bhandare
        String name8 = new String("BHANDARE");  // OA --> BHANDARE
        String name9 = new String("bhandare");  // OA --> bhandare





    }
}
