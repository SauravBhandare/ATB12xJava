package ex_16_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab_152_Array_syntax {

    public static void main(String[] args) {

        // 1st way to create Array
        int[] numbers = {10,20,30,40,50};
        System.out.println(Arrays.toString(numbers));

        // 2nd way to create array
        int[] num = new int[5];
        int numb[] = new int[3];

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(numb));

    }
}
