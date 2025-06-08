package ex_16_Arrays;

public class Lab_154_Arrays_print {
    public static void main(String[] args) {

        int[]  score = {20,43,65,75,32,42};
        System.out.println(score.length);
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score[3]);
        System.out.println(score[4]);
        System.out.println(score[5]);

        System.out.println("--------Print values using for loop -------");

        for (int i = 0 ; i< score.length ; i++)
        {
            System.out.println(score[i]);
        }

        System.out.println("----------Print values using enhanced ore loop (This is only used in Arrays)-------------");

        for ( int test : score)
            System.out.println(test);

    }
}
