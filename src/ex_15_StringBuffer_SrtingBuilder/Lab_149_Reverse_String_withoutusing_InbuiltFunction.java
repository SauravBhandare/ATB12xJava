package ex_15_StringBuffer_SrtingBuilder;

public class Lab_149_Reverse_String_withoutusing_InbuiltFunction {

    public static void main(String[] args) {

        String name = "Saurav Bhandare";

        for(int i= name.length()-1;i>=0;i--)
        {
            System.out.print(name.charAt(i));
        }
    }
}
