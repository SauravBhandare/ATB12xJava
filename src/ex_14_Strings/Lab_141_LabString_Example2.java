package ex_14_Strings;

public class Lab_141_LabString_Example2 {
    public static void main(String[] args) {

        String s1= (String) "Saurav".subSequence(2,5); // (2,5) means staring from 2 and ending at 4
        /* S--> Index is 0
           A--> Index is 1
           U--> Index is 2
           R--> Index is 3
           A--> Index is 4
           V--> Index is 5
         */
        System.out.println(s1);

        String s2 = (String) "Bhandare".subSequence(1,3);
        System.out.println(s2);

        String s3 = (String) "Saurav".subSequence(2,3);
        System.out.println(s3);


    }
}
