package ex_16_Arrays;

import java.util.Arrays;

public class Lab_151_Arrray_Basics {

    public static void main(String[] args) {

        int i = 0 ;  // normal integer

        int[] numbers = { 10,20,30,40,50,20,90};  // Array

       // int[] num = {10,20,30,70, "Saurav"}; // Array can only have same datatype

        System.out.println(numbers.length);  // 7 (length starts from 1)
        System.out.println(numbers[0]); // 10 (Index starts from 0)
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        //System.out.println(numbers.[-1]); Invalid (ArrayoutofBoundException)
      //  System.out.println(numbers.[10]); Invalid (ArrayoutofBoundException)


        char c = 'A'; // char
        String name = "Saurav";
        String[] split = name.split("");
        System.out.print(Arrays.toString(split));

        System.out.println("----------");


        String st = " Saurav Bhandare ";
        System.out.println(st.trim());
        String[] split1 = st.split("");
        System.out.println(Arrays.toString(split1));



    }
}
