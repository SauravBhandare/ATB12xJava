package ex_16_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class Lab_160_Arrays_findingsecondhighest_using_sort {

    public static void main(String[] args) {

        int[] numbers = {42,52,52,145,75,35,36};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);

    }
}
