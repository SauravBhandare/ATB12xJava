package ex_10_for_loop;

public class Lab_113_for_loop_continue_even_odd_no {

    public static void main(String[] args) {

        for (int i =0 ; i<=50 ; i++)
        {
            if(i%2==0)
            {
                continue;
            }
            else
            {
                System.out.println("Odd --> " + i);
            }
        }
    }
}
