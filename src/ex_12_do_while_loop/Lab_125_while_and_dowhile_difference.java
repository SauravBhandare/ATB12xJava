package ex_12_do_while_loop;

public class Lab_125_while_and_dowhile_difference {

    public static void main(String[] args) {

        int i =1;
       /* while(i<=0)  //Condition is false so it will not print any output
        {
            System.out.println(i);
            i++;
        }

        */

        do {
            System.out.println(i);  // First it will execute once and then check condition
            i++;
        }
        while(i<=0);
    }
}
