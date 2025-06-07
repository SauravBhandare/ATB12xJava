package ex_15_StringBuffer_SrtingBuilder;

public class Lab_146_StringBuffer {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Saurav"); // Saurav
        System.out.println(stringBuffer.append("Bhandare"));  // Saurav replaces to SauravBhandare


        String s1= "Saurav";
        System.out.println(s1 + "Bhandare");
        // Here 2 different String will be created Saurav and SauravBhandare
        // As Strings are immutable in nature they cannot change

    }
}
