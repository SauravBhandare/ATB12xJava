package ex_09_Switch;

public class Lab_096_Interview5_Duplicate_case {

    public static void main(String[] args) {

        int a=10;
        switch(a)
        {
            case 10:
                System.out.println("Valid");
                break;
           // case 10:   // no duplicates are allowed in switch
              //  System.out.println("Valid");   // java: duplicate case label
             //   break;
        }
    }
}
