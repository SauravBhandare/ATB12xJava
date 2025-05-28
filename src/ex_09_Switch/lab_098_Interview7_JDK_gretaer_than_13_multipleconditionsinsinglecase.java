package ex_09_Switch;

public class lab_098_Interview7_JDK_gretaer_than_13_multipleconditionsinsinglecase {

    public static void main(String[] args) {

        int a1 = -30;


        switch (a1)
        {
            case 10,30,50:
            System.out.println("Odd");
            break;
            case 20,40,60:
                System.out.println("Even");
                break;
            default:
                System.out.println("None of these");
                break;


        }

    }
}
