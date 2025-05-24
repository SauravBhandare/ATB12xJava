package ex_08_Condition;

public class Lab_084_Ifelse_condition_CLI {

    public static void main(String[] args) {

        String age = args[0];
        int i1= Integer.parseInt(age);

        if(i1>18)
        {
            System.out.println("You can go to Goa");
        }
        else
        {
            System.out.println("You cannot go to Goa");
        }

    }
}
