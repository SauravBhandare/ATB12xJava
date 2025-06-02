package ex_13_Functions;

public class Lab_128_Functions_userdefined_returnable_nonReturnable {

    // In user defined functions there are 2 steps
    // Step 1 : First we need to define the function
    // Step 2 : We need to call the function


    public static void main(String[] args) {
         // Calling

        int result = returnable_function();  // returnable function will return the datatype
        System.out.println(result);

        String result1 = returnable_function1();
        System.out.println(result1);

        non_returnable_function();  // void function will just print the value


    }

    // return function will always return a datatype
   static int returnable_function()
     {
         System.out.println("Hi , I am returnable_function");
         return(3) ;
     }

     static String returnable_function1()
     {
         System.out.println("Hi I am Saurav");
         return "Saurav";
     }

    // void or non_returnable_function does not return anything it will just print the value
   static  void non_returnable_function ()
     {
         System.out.println("Hi , I am non returnable function");
     }
}
