package ex_10_for_loop;

public class Lab_108_for_loop_decrement {

    public static void main(String[] args) {

        for (int i =-1 ; i>-10 ; i--)
        {
            System.out.println(i);
        }

        // We can also have Initialization outside the loop

        int j =0;
        for ( ; j<10 ; j++)
        {
            System.out.println(j);
        }
    }
}
