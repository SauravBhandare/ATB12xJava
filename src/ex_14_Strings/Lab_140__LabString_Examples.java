package ex_14_Strings;

public class Lab_140__LabString_Examples {

    public static void main(String[] args) {


        //charat Function : Finds the character index (Index starts from 0,1,2,3,4 etc)
        String name = "Saurav";
        char c = name.charAt(2);
        char c1= name.charAt(5);
        System.out.println("Char at 2 is: " + c);
        System.out.println("Char at 5 is: " + c1);

        //Compareto function (checks if 2 functions are same)
        int s1 = "abc".compareTo("ABC");
        System.out.println(s1);
        String s2 = String.valueOf("ABC".compareTo("abc"));
        System.out.println(s2);

        //comparetoignorecase function  (checks if 2 functions are same and returns 0 or -1)

        int s3 = "ABC".compareToIgnoreCase("abc"); //0
        System.out.println(s3);
        String s4 = String.valueOf("abc".compareToIgnoreCase("ABCD"));  //-1
        System.out.println(s4);

        // indexof function (Finds the index of String)
        int s7 = "Saurav".indexOf("a");
        String s8 = String.valueOf("Saurav".indexOf("v"));
        System.out.println("Index of 2 is : " + s7);
        System.out.println("Index of 5 is : " + s8);

        //LastIndex of Function (FInds last index)
        int s9 = "Saurav".lastIndexOf("a");
        System.out.println("Last Index of a is : " + s9);

        //IsEmpty function
        boolean b = "".isEmpty();
        System.out.println(b);

        //IsBlank function
        boolean b1= "".isBlank();
        System.out.println(b1);

        //join function
        String i1 = String.join("_", "Bhandare" ,"Saurav");
        System.out.println(i1);

        // replace function
        String s10 = "Saurav".replace("a","o");
        System.out.println(s10);

        //starts with function
        boolean b2 = "Saurav".startsWith("Sa");
        System.out.println(b2);
        boolean b3 = "Saurav".startsWith("sa");
        System.out.println(b3);





    }
}
