package ex_14_Strings;

public class Lab_139_String_Functions1 {
    public static void main(String[] args) {


        // SCP
        String name = "Saurav";
        String name1= "Saurav";

        // OA
        String name2= new String("SAURAV");

        System.out.println(name==name1);  // true
        System.out.println(name==name2);  // false
        System.out.println(name.equals(name2)); // false
        System.out.println(name.equalsIgnoreCase(name2));  // true

        System.out.println(name.concat(name2)); // It will be stored in SCP as SauravSAURAV
    }
}
