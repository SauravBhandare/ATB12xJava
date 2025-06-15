package Lab_18_Constructors;

public class Lab_169_DefaultCOnstructors {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        new Baby();
        new Baby();
        Baby b2;


    }



    static class Baby {
        String name;

        // Default Constructor
        public Baby() {
            System.out.println("Hi, I am called object is created");
        }
    }
}
