package ex_03_Literals;

public class Lab_034_Literals_Char {

    public static void main(String[] args) {

        char c1 = 'A';
        char c2 = '$';
        char c3 = '_';
        char c4 = ' ';

        //Escape char

         char c5 = '\n' ;   // to print in new line
         char c6 = '\t';   // to have a tab between 2 words
         char c7 = '\b';  // to have a backspace between 2 words

        System.out.println("SauravBhandare");
        //System.out.println("Saurav"+new_line+"Bhandare");
        System.out.println("Saurav\nBhandare");
      //  System.out.println("Saurav" + tab_line + "Bhandare");
        System.out.println("Saurav\tBhandare");
      //  System.out.println("Saurav" + back_line + "Bhandare");
        System.out.println("Saurav\bBhandare");
    }
}
