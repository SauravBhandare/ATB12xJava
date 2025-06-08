package ex_16_Arrays;

import java.util.Arrays;

public class Lab_153_Array_syntax1 {

    public static void main(String[] args) {


        // 1st way to create Arrays

        String [] names = {"Saurav","Gaurav","Test","Abc"};
        System.out.println(Arrays.toString(names));

        //2nd way to create Arrays
        String[] name1 = new String[3];
        name1[0] = "Bhandare";
        name1[1] = "KAdam";
        name1[2] = "Gurav";

        System.out.println(Arrays.toString(name1));
        System.out.println(name1.length);
        System.out.println(name1[0]);

        boolean[] b1 = new boolean[2];
        b1[0] = true;
        b1[1] = false;

        System.out.println(b1[0]);
        System.out.println(b1[1]);




    }
}
