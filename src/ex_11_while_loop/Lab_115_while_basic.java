package ex_11_while_loop;

public class Lab_115_while_basic {

    public static void main(String[] args) {

        //While loop is same as for loop
        // In while loop we just do initilization outside and check condition in while loop
        //Condition must be true to execute while loop

        int i = 1;            // initialization outside
        while (i<=10)         // condition must be true to execute while loop
        {
            System.out.println(i);
            i++;
        }

        // For loop

        for (int j=1 ;j<=10 ;j++)  // same condition using for loop
        {
            System.out.println(j);
        }
    }
}
