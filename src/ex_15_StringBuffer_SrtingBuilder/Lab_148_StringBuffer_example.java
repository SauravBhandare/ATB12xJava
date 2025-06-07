package ex_15_StringBuffer_SrtingBuilder;

public class Lab_148_StringBuffer_example {

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Learning");  // Learning
        System.out.println(stringBuffer.append(" Java Programming"));  // Learning Java Programming
        System.out.println(stringBuffer.replace(9,13, "C++")); //Learning C++ Programming
        System.out.println(stringBuffer.delete(9,13));

    }
}
