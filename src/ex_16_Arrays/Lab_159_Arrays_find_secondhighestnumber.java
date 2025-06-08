package ex_16_Arrays;

public class Lab_159_Arrays_find_secondhighestnumber {

    public static void main(String[] args) {

        int[] numbers = { 10,42,53,35,45,64,21};
        int high = 0;
       int second_highest = 0;

        for (int i=0 ;i< numbers.length ; i++)

            if ( numbers[i]> high)
            {
                second_highest=high;
                high=numbers[i];


            }

        System.out.println("Second Highesh number is :" + second_highest);


    }
}
