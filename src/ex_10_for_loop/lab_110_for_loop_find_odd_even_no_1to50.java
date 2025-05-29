package ex_10_for_loop;

public class lab_110_for_loop_find_odd_even_no_1to50 {

    public static void main(String[] args) {

        //find even and odd number from 1 to 50

        for (int i=1 ;i<=50 ; i++)
        {
            if(i%2 ==0)
            {
                System.out.println("Even --> " +  i);
            }
            else
            {
                System.out.println("Odd --> " + i);
            }
        }
    }
}
