package ex_13_Functions;

public class Lab_130_Functions_Types_of_user_defined_functions {

    // USer Defined Functions
    // There are 4 types of user defined functions
    // without parameter and without result
    // without parameter but with result
    // with parameter but without result
    // with parameter and with result

    public static void main(String[] args) {

        // calling

        // 1.  without parameter and without result
         without_parameter_without_return();

        // 2. without parameter but with result
       String result1 = without_parameter_with_return();
        System.out.println(result1);

        // 3. with parameter but without return
        with_parameter_without_return ( "Saurav" , 31 , 10000);
        with_parameter_without_return ( "Test" , 12 , 700);


        // 4. with parameter and with return
         int add = with_parameter_with_return(10,20);
        System.out.println(add);

    }

        //  Defining

    // 1.  without parameter and without return
   static void without_parameter_without_return()
    {
        System.out.println("Hi , I am without_parameter_without_return");
    }

    // 2. without parameter but with return
    static String without_parameter_with_return()
    {
        System.out.println("Hi , I am without_parameter_with_return");
        return "Saurav";
    }

    // 3. with parameter but without return (90% use)

    static void with_parameter_without_return(String Name , int Age , double Salary)
    {
        System.out.println("My Name is :" + Name + "\n My Age is :" + Age +  "\n My Salary is :" + Salary);
    }

    // 4. with parameter and with return
    static int with_parameter_with_return(int a , int b)
    {
        System.out.println("Adddition of a+b :");
        return a+b;
    }
}
