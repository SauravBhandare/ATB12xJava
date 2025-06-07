package ex_15_StringBuffer_SrtingBuilder;

public class LAb_150_Reverse_String_using_inbuilt_function {

    public static void main(String[] args) {

        // As StringBuilder and StringBuffer are mutable in nature they will change their values

        StringBuilder stringBuilder= new StringBuilder("Saurav");  // Saurav
        System.out.println(stringBuilder.reverse());  // Saurav will change to varuaS


        StringBuffer stringBuffer = new StringBuffer("Bhandare");  // Bhandare
        stringBuffer.reverse();  // Bhandare will change to eradnahB
        System.out.println(stringBuffer);


        // This example is without using inbuilt function just for comparison
        //As String is immutable in nature so it will assign a new value and not change the existing value

        String name = "Saurav";
        for(int i = name.length()-1; i>=0 ; i--)
        {
            System.out.print(name.charAt(i));
        }
    }
}
