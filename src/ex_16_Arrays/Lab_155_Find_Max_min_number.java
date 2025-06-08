package ex_16_Arrays;

import java.sql.Array;

public class Lab_155_Find_Max_min_number {

    public static void main(String[] args) {

        int[]  numbers = { 43,51,73,62,74,26,84,96,26};;
        int max_num = numbers[0];
        int min_num = numbers [0];

        for(int i = 0 ; i< numbers.length ; i++)

            if(numbers[i]>max_num){
                max_num=numbers[i];
            }
        System.out.println("highest number is: " + max_num);

        for (int i=0 ; i<numbers.length ; i++)
            if (numbers[i]<min_num)
            {
                min_num=numbers[i];
            }
        System.out.println("Lowest Number is :" + min_num);





    }
}
