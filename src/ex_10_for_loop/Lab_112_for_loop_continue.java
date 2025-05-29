package ex_10_for_loop;

public class Lab_112_for_loop_continue {

    public static void main(String[] args) {

        for (int i =0 ; i<=10 ; i++)
        {
            if(i==5)
            {
                continue;  // continue means skip the condition
            }
            System.out.println(i);
        }
    }
}
