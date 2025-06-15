package ex_17_OOPS;

public class Lab_166_OOPS_using_common_class {
    public static void main(String[] args) {

        ATB12x_Common_class Saurav = new ATB12x_Common_class();
        //ATB12x --> Class
        // Saurav --> Object Reference
        // new ATB12x --> Object

        ATB12x_Common_class Test = new ATB12x_Common_class();

        //Attributes
        Saurav.name= "Saurav Bhandare";
        Saurav.age=25;
        Saurav.Gender="Male";
        Saurav.work= "QA";
        Saurav.Location = "Borivali";
        Saurav.salary= 10000;

        // Behaviour

        Saurav.walk();
        Saurav.speak();
        Saurav.dotask();
        Saurav.raisebugs();

        // Attributes
        Test.name= "Test 123";
        Test.age = 23;

        // Behaviour
        Test.raisebugs();
    }
}
